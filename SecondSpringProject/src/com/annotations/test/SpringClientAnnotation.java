package com.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.StudentData;

public class SpringClientAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("annotation.xml");
		StudentData studentData= (StudentData) context.getBean("studentData");
		System.out.println(studentData);
		
		
		///Autowired
		
		StudentService service= (StudentService) context.getBean("studentService");
		System.out.println(service.setStudentdetails(1, "Vikram", "Gangasagar", "S101"));
	}

}
