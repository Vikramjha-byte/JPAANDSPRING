package com.jpa.FirstDay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
	
	public static void main(String[] args) throws SQLException {
		Connection c=null;
		try {
			Class.forName("org.postgresql.Driver");
			c= DriverManager.getConnection("jdbc:postgresql://localhost/vikram", "postgres", "Exact@167");
			Statement stmt= c.createStatement();
			System.out.println("Created statements....");
			boolean rs=stmt.execute("Insert into vikram(name,rollno,address,phoneno) values('vikram','101','Bihar','7979893048')");
			ResultSet rset= stmt.executeQuery("Select * from vikram");
			while(rset.next()) {
				System.out.println(rset.getString(1)+","+rset.getString(2)+","+rset.getString(3)+","+rset.getString(4)+","+rset.getString(5));
			}
			System.out.println(rs);
			if(rs==false)
				System.out.println("Inserted into table.....");
		}catch(ClassNotFoundException e) {
			System.out.println( e.getMessage());
		}
		System.out.println("Opened database successfully");
	}

}
