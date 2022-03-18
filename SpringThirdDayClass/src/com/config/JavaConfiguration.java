package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.beans.Student;

@Configuration
@ComponentScan("com")
@Import(JavaConfig1.class)

@PropertySources({
	@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:common.properties")
})
public class JavaConfiguration {
	
	@Bean
	public Student getStudent() {
		
		return new Student();
	}

}
