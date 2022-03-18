package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class BankEmployee implements Employee {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi! You are bank employee");
	}
	
	

}
