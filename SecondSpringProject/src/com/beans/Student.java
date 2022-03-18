package com.beans;

public class Student {
	private  int Student_id;
	private String Student_name;
	private String Student_address;
	private String Student_rollno;
	private Course course;
	
	
	
//	public Student() {
//		super();
//	}
	public Student(int student_id, String student_name, String student_address, String student_rollno, Course course) {
		super();
		Student_id = student_id;
		Student_name = student_name;
		Student_address = student_address;
		Student_rollno = student_rollno;
		this.course = course;
	}
	
	
	public Student(Course course) {
	super();
	this.course = course;
}


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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_address="
				+ Student_address + ", Student_rollno=" + Student_rollno + ", course=" + course + "]";
	}

}
