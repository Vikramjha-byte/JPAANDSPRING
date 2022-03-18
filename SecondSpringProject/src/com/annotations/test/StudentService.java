package com.annotations.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.StudentData;


@Component
public class StudentService {
	
	@Autowired
	 private StudentData studentData;
	 
    public StudentData setStudentdetails(int id,String name,String address,String rollno) {
    	
    	studentData.setStudent_id(id);
    	studentData.setStudent_name(name);
    	studentData.setStudent_address(address);
    	studentData.setStudent_rollno(rollno);
    	
    	return studentData;
    }
}
