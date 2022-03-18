package com.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pojo.Courses;
import com.pojo.Customer;

public class JPAClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPAProject");
		
		EntityManager em= factory.createEntityManager();
		
		em.getTransaction().begin();
		
		///Fetching the data
//		Query query= em.createQuery("select c from Customer c");// working with the object of customer.
//		List<Customer> custList= query.getResultList();
//		for(Customer x : custList) {
//		System.out.println(custList);
//		}
		
		
		//Inserting the Data
		
//		Customer customer= new Customer();
////		customer.setId(101);
//		customer.setName("Ranjana");
//		customer.setAddress("Bihar");
//		customer.setBalance(6070.0f);
//		em.persist(customer);
//		em.getTransaction().commit();
		
		
////		Inserting data into courses table
//		
//		Courses courses= new Courses();
//		courses.setCourse_name("Hibernate");
//		courses.setCourse_duration("3 months");
//		courses.setCourse_cost(4000);
//		em.persist(courses);
//		em.getTransaction().commit();
		
		//Deleting 
		
		Customer cust= em.find(Customer.class, 0);
		
		em.remove(cust);

	}

}
