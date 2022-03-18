package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Student;
import com.config.JavaConfiguration;

public class SpringClient {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Student s= (Student)context.getBean("student");
		System.out.println(s);
	}
    
	
}
