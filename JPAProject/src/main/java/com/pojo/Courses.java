package com.pojo;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courses_course_id_seq")
	@SequenceGenerator(name = "courses_course_id_seq", sequenceName = "courses_course_id_seq", allocationSize = 1)
	private int course_id;
	private String course_name;
	private String course_duration;
	private int course_cost;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	public int getCourse_cost() {
		return course_cost;
	}
	public void setCourse_cost(int course_cost) {
		this.course_cost = course_cost;
	}
	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", course_name=" + course_name + ", course_duration="
				+ course_duration + ", course_cost=" + course_cost + "]";
	}

}
