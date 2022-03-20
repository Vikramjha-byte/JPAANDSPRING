package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("program started...");
		/*
		 * Not a recommended way , but we can do it also in this way // Spring JDBC=>
		 * JdbcTemplate
		 * 
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com//spring//jdbc/config.xml"); JdbcTemplate
		 * template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 * 
		 * // Insert query
		 * 
		 * String query = "insert into student(name,address) values(?,?)";
		 * 
		 * // fire query
		 * 
		 * int result=template.update(query, "Vikram", "Darbhanga");
		 * System.out.println(result);
		 */
		
		//XML BASED CONFIGURATION
//		ApplicationContext context = new ClassPathXmlApplicationContext("com//spring//jdbc/config.xml");
		
		//JAVA BASED CONFIGURATION
		ApplicationContext context= new AnnotationConfigApplicationContext(JDBCConfig.class);
		StudentDao dao= context.getBean("dao",StudentDao.class);
		
		/*
		 * //Insert 
		 * Student s= new Student();
		 * s.setName("Rajesh");
		 * s.setAddress("Madarpur");
		 * 
		 * int result=dao.insert(s);
		 * 
		 * //Update 
		 * Student s1= new Student(); 
		 * s1.setId(2); 
		 * s1.setName("Anuradha");
		 * s1.setAddress("Gangasagar");
		 * 
		 * int change = dao.change(s1); 
		 * //delete 
		 * Student s2= new Student(); s2.setId(3);
		 * int delete = dao.delete(s2);
		 * System.out.println("student inserted and updated and deleted..."+
		 * result+","+change+","+delete);
		 */
		//Select single object data ----> RowMapperImpl or anonymous class or lambdas expression
//		Student student = dao.getStudent(5);
//		System.out.println(student);
		
		
		//Select multiple object data ----> RowMapperImpl or anonymous class or lambdas expression
		List<Student> students = dao.getStudents();
		for(Student s: students)
			System.out.println(s);
	}
}
