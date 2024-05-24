package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class SpringConfigFile {
@Bean
public DriverManagerDataSource mydataSource()

{
	DriverManagerDataSource dataSource =new DriverManagerDataSource();
	
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	
	return dataSource;
}
@Bean
public JdbcTemplate MyJdbcTemplate()

{
	JdbcTemplate jdbcTemplate= new JdbcTemplate();
	
	jdbcTemplate.setDataSource( mydataSource());
	
	return jdbcTemplate;
	
	
	
}

}
