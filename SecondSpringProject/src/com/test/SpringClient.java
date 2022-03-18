package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("annotation.xml");
		Student student= (Student)context.getBean("student");
		System.out.println(student.getCourse());
		
		ApplicationContext context1= new ClassPathXmlApplicationContext("annotation.xml");
		Student student1= (Student)context1.getBean("student");
		System.out.println(student1.getCourse());

	}

}
