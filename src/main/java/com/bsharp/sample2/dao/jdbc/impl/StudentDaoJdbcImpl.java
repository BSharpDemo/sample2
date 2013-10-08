package com.bsharp.sample2.dao.jdbc.impl;

import java.util.List;

import com.bsharp.sample2.dao.StudentDao;
import com.bsharp.sample2.domain.Student;
import com.bsharp.sample2.exception.BSharpException;

public class StudentDaoJdbcImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Student getStudent(int id) throws BSharpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() throws BSharpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student addStudent(Student student) throws BSharpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int studentId) throws BSharpException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	/*
	
	@Override
	public List<Result> getRetulsBySubject(String subjectCode) throws BSharpException{

		String sqlStr = "SELECT "
						+ " rs.id,"
						+ " rs.student_id,"
						+ " s.studentName,"
						+ " rs.subject_id,"
						+ " rs.latestY3,"
						+ " rs.latestY5,"
						+ " rs.latestY7,"
						+ " rs.latestY9,"
						+ " rs.rawGainY3Y5,"
						+ " rs.factoredGainY3Y5,"
						+ " rs.glgY3Y5,"
						+ " rs.latestGainInGainY3Y5"
						+ " FROM results rs"
						+ " INNER join subjects sub on sub.id=rs.subject_id"
						+ " INNER join students  s on s.id=rs.student_id"
						+ " WHERE "
						+ "  sub.id=?";

		RowMapper<Result> rowMapper = new RowMapper<Result>() {
			@Override
			public Result mapRow(ResultSet rs, int i) throws SQLException {
				Result r = new Result();
				r.setId(rs.getString("id"));
				 
				r.setSchoolName(rs.getString("s.studentName"));
				return r;
			}
		};
		Object [] args = {subjectCode};
		List<Result> results = jdbcTemplate.query(sqlStr,args, rowMapper);
		return results;
	}


	@Override
	public Student getAllSchool(String id) throws BSharpException {
		String select = "SELECT *  FROM students";
		return null;
	}

	@Override
	public List<Student> getAllSchools() throws BSharpException {

		String select = "SELECT *  FROM students";
		 
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int i) throws SQLException {
				Student c = new Student();
				 c.setName(rs.getString("name"));
				return c;
			}
		};
		
		List<Student> students = jdbcTemplate.query(select, rowMapper);
		return students;
	}

	@Override
	public List<Student> getSchoolsBySubject(String subjectCode)
			throws BSharpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getSubjectList() throws BSharpException {
		// TODO Auto-generated method stub
		return null;
	}
	
	*/
}
