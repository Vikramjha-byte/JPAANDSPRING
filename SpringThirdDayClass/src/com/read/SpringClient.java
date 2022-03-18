package com.read;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.College;
import com.beans.Commons;
import com.client.EmployeeExecutor;
import com.config.JavaConfiguration;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfiguration.class);
//		DataSource reader= (DataSource) context.getBean("dataSource");
//		System.out.println(reader.getDriver());
//		System.out.println(reader.getUrl());
		
		College college= (College) context.getBean("getCollege");
		
		System.out.println(college);
		
		Commons commons= (Commons) context.getBean("commons");
		System.out.println(commons);
		
	EmployeeExecutor employeeExecutor=	(EmployeeExecutor) context.getBean("employeeExecutor");
	employeeExecutor.doExecute();
	}

}
