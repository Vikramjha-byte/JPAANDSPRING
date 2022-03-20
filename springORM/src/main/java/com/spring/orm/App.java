package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("*********************Welcome to ORM PROJECT***********************");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao dao = context.getBean("dao", StudentDao.class);

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean b= true;
		while (b) {
			System.out.println("Press 1 to add student\r\n" + "Press 2  to get all students\r\n"
					+ "Press 3 to get a student\r\n" + "Press 4 to delete student\r\n"
					+ "Press 5 to update student details\r\n" + "Press 6 to get exit");
			try {

				int choice = Integer.parseInt(bufferedReader.readLine());

				switch (choice) {
				case 1:
				
					System.out.println("Enter Username");
					String userName=bufferedReader.readLine();
					System.out.println("Enter address");
					String userAddress= bufferedReader.readLine();
					Student s= new Student();
					
					s.setName(userName);
					s.setAddress(userAddress);
					int r = dao.insert(s);
					
					System.out.println(r + " user added");
					break;
				case 2:
					List<Student> students = dao.getStudents();
					for(Student x: students)
						System.out.println(x);
					break;
				case 3:
					System.out.println("Enter user id");
					int userId=Integer.parseInt(bufferedReader.readLine());
					Student student = dao.getStudent(userId);
					System.out.println(student);
					break;
				case 4:
					System.out.println("Enter user id");
					int uId= Integer.parseInt(bufferedReader.readLine());
					dao.delete(uId);
				System.out.println("User deleted");
					break;
				case 5:
					System.out.println(" Enter your user id");
					int parseInt = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter new username");
					String readLine = bufferedReader.readLine();
					System.out.println("Enter new address");
					String add= bufferedReader.readLine();
					Student st= new Student();
					st.setId(parseInt);
					st.setName(readLine);
					st.setAddress(add);
					dao.update(st);
					break;
				case 6:
					System.out.println("Thank You for using my application");
					b=false;
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}

			} catch (Exception e) {
				System.out.println(" try with another one");
			System.out.println(e.getMessage());
			}
			
		}

		/*
		 * Student student = new Student(); student.setName("Vikram");
		 * student.setAddress("Gangasagar"); int result = dao.insert(student);
		 * 
		 * // dao.delete(1); List<Student> students = dao.getStudents();
		 * System.out.println(students); System.out.println("Data Inserted"+result);
		 */
	}
}
