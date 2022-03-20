package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		// Insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	@Transactional
	public void delete(int studentid) {
		// Delete
		Student student = this.hibernateTemplate.get(Student.class, studentid);
		this.hibernateTemplate.delete(student);
		
	}
	@Transactional
	public void update(Student student) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(student);
		
	}
	public Student getStudent(int studentid) {
		// single object
		
	Student student= this.hibernateTemplate.get(Student.class,studentid);
		return student;
	}
	
	public List<Student> getStudents() {
		// multiple object
		
		List<Student> students= this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	


	

	



	

}
