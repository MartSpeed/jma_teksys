package com.example.demo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import employeeDAO.FindEmployee;
import entity.EmployeeEntity;

//@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
		// find the employee method call
		FindEmployee employee = new FindEmployee();
		employee.findEmp();
		
		
		
		// SpringApplication.run(MavenDemoProjectApplication.class, args);

		// create our own session MAY 2 2022
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//
//		// open the session we want to run
//		Session session = factory.openSession();
//
//		// transactions, what do we want to do
//		Transaction t = session.beginTransaction();

//		// string session FROM
//		// setting a finder?
//		String findUserString = "FROM employee";		
//		// create a query to find the users for us
//		Query q = session.createQuery(findUserString);
//		// this creates our table
//		EmployeeEntity employeeEntity = new EmployeeEntity();		
//		//
//		List<EmployeeEntity> resultsEmployeeEntity = q.getResultList();
//		//for loop for list
//		for(EmployeeEntity e : resultsEmployeeEntity) {
//			System.out.println("user id: " + e.getEmp_id() + " first name: " + e.getFirstName());
//		}

		//
//		employeeEntity.setEmp_id(1);
//		employeeEntity.setFirstName("Han");
//		employeeEntity.setLastName("Solo");
//		employeeEntity.setCity("Keplar 22-b");
//		employeeEntity.setEmail("kesslerruninunderaparsec@chewienet.com");
//		employeeEntity.setSalary(99999999);
//		
//		// session merge
//		session.merge(employeeEntity);
//
//		// 05/03/2022
//		// grab any information by using these indiviual sessions
//		int emp_id = 1; // another way to manually grab the emp_id?
//		EmployeeEntity e = session.load(EmployeeEntity.class, emp_id);
//
//		//
//		System.out.println("user first name: " + e.getFirstName());
//		//
//		System.out.println("user last name: " + e.getLastName());
//		//
//		System.out.println("user city name: " + e.getCity());
//		//
//		System.out.println("user email name: " + e.getEmail());
//		//
//		System.out.println("user salary: " + e.getSalary());
//
//		// save the session
//		// save, commit, close
//		session.save(e);
//
//		//
//		System.out.println("We created out tables");
//
//		//
//		t.commit();
//
//		factory.close();
//		session.close();
	}

}
