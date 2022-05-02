package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.EmployeeEntity;

//@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MavenDemoProjectApplication.class, args);
		
		// create our own session MAY 2 2022
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		// open the session we want to run
		Session session = factory.openSession();
		
		// transactions, what do we want to do
		Transaction t = session.beginTransaction();
		
		// this creates our table
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		//
		t.commit();
		
		//
		System.out.println("We created out tables");
		
		factory.close();
		session.close();
	}

}
