package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.annotation.Employee;

@Component
public class EmployeeExecutor {
	@Autowired
	@Qualifier("softwareEmployee") // if more than one implemented class will be there then we can use qualifier to
									// state which implemented class we want to call
	Employee emp;

	public void doExecute() {
		emp.display();
	}
}
