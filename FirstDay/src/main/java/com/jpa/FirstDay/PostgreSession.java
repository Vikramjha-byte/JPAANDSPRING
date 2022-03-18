package com.jpa.FirstDay;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.*;
@Entity
class Student{
	
	@Id
	private int id;
	
	private String name;
	private String rollno;
	private String address;
	private String phoneno;
	public Student(int id, String name, String rollno, String address, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		this.phoneno = phoneno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}

class ConnectionProvider {
	
	private static Connection c;
	
	public static  Connection getConnection() {
		
	if(c==null) {
	try {
			
			Class.forName("org.postgresql.Driver");
			 c=  DriverManager.getConnection("jdbc:postgresql://localhost/vikram", "postgres", "Exact@167");
		
		
		
	}catch(Exception e) {
		e.getMessage();
	}
	}
		return c;
}
}

public class PostgreSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con= ConnectionProvider.getConnection();
		System.out.println(con);
		

	}

}
