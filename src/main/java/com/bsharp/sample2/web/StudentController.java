package com.bsharp.sample2.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsharp.sample2.domain.Result;
import com.bsharp.sample2.domain.Subject;
import com.bsharp.sample2.exception.BSharpException;
import com.bsharp.sample2.service.StudentService;


@Controller
public class StudentController {

	private static final Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		logger.debug("Arrived Welcome Page");
		
		List<Subject> subjects;
		try {
			subjects = studentService.getSubjectList();
			
			model.addAttribute("subjects", subjects);
			
		} catch (BSharpException e) {
			logger.error(e.getMessage());
		}

		return "home";
	}
	
	@RequestMapping(value="getResultsJSON",method = RequestMethod.GET)
	public @ResponseBody String getJson(@RequestParam("subject")   String subject,ModelMap model) {
		 String jsonStr="";
		 try {
			logger.info(" Get JSON result for subject"+ subject);
			List<Result> results=studentService.getRetulsBySubject(subject);
			ObjectMapper mapper = new ObjectMapper();
			jsonStr=mapper.writeValueAsString(results);
			
		} catch (Exception e) {
			logger.error(" Error " +e.getMessage());
			jsonStr="[{\"error\", \""+e.getMessage()+"\"}]";
		}
		return  "{ \"students\": " +jsonStr +" }";
	}
}