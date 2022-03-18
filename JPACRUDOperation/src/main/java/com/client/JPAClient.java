package com.client;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

import com.entities.Student;

public class JPAClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPACRUDOperation");
		EntityManager entityManager= factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Student s=new Student();
		s.setAddress("Gangasagar");
		s.setName("Vikram");
		entityManager.persist(s);
		entityManager.getTransaction().commit();

	}

}
