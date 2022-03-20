package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("dao")
public class StudentDaoimpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// Insert data
		String query = "insert into student(name,address) values(?,?)";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getAddress());
		return r;
	}

	public int change(Student student) {
		// Update data
		String query = "update student set name=?, address=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getId());
		return r;
	}

	public int delete(Student student) {
		// Delete operation
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, student.getId());
		return r;
	}

	public Student getStudent(int studentId) {
		// Select Operation==> single object

		String query = "select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperimpl();
		Student s = this.jdbcTemplate.queryForObject(query, rowmapper, studentId);
		/*
		 * Student s = this.jdbcTemplate.queryForObject(query, (ResultSet rs, int
		 * rowNum) -> { Student student = new Student(); student.setId(rs.getInt(1));
		 * student.setName(rs.getString(2)); student.setAddress(rs.getString(3)); return
		 * student;
		 * 
		 * }, studentId);
		 */
		return s;
	}
	@Override
	public List<Student> getStudents() {
		// Selecting multiple student
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperimpl());
		return students;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
