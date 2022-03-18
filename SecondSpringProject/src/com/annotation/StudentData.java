package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class StudentData {
	private  int Student_id;
	private String Student_name;
	private String Student_address;
	private String Student_rollno;
//	public StudentData(int student_id, String student_name, String student_address, String student_rollno) {
//		super();
//		Student_id = student_id;
//		Student_name = student_name;
//		Student_address = student_address;
//		Student_rollno = student_rollno;
//	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_address() {
		return Student_address;
	}
	public void setStudent_address(String student_address) {
		Student_address = student_address;
	}
	public String getStudent_rollno() {
		return Student_rollno;
	}
	public void setStudent_rollno(String student_rollno) {
		Student_rollno = student_rollno;
	}
	@Override
	public String toString() {
		return "StudentData [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_address="
				+ Student_address + ", Student_rollno=" + Student_rollno + "]";
	}
	
	

}
