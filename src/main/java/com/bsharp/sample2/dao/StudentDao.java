package com.bsharp.sample2.dao;

import java.util.List;

import com.bsharp.sample2.domain.Result;
import com.bsharp.sample2.domain.Student;
import com.bsharp.sample2.domain.Subject;
import com.bsharp.sample2.exception.BSharpException;

public interface StudentDao {
	
	public Student getStudent(int id) throws BSharpException;
	
	public List<Student> getAllStudents() throws BSharpException;

	public Student addStudent(Student student) throws BSharpException;
	
	public boolean deleteStudent(int studentId) throws BSharpException;

}
