package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
@ComponentScan("com")
public class JavaConfiguration {
	
	@Bean
	public Student getStudent() {
		
		return new Student();
	}

}
