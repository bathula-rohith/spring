package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student st = new Student();
		st.setStroll(rs.getInt(1));
		st.setStname(rs.getString(2));
		st.setStmarks(rs.getFloat(3));
	
		
		return st;
	}

}
