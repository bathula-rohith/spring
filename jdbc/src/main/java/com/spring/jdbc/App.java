package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    


        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String qry = "select * from student";
       
   List<Student> std  = jdbcTemplate.query(qry, new StudentRowMapper());
   for(Student std1:std)
   {
	   System.out.println("roll is:"+std1.getStroll());
	   System.out.println("Name is:"+std1.getStname());
	   System.out.println("marks is:"+std1.getStmarks());
	   System.out.println("---------------");
	   
   }

    }
}
