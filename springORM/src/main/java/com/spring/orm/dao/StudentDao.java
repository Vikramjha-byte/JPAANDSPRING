package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	public void delete(int studentid);
	public void update(Student student);
	public Student getStudent(int studentid);
	public List<Student> getStudents();
}
