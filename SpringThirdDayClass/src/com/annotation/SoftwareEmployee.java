package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEmployee implements Employee {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi you are a software employee");
	}

}
