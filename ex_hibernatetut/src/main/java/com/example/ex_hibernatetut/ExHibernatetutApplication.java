package com.example.ex_hibernatetut;

import com.example.ex_hibernatetut.entity.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExHibernatetutApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExHibernatetutApplication.class, args);

		// create new instance of the object to us
		UserDetails user = new UserDetails();

		// change the value of users
		user.setUserId(1);
		user.setUserName("First User");

		// save the object in the database using the HQL API methods
		// use this to create new sessions
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// define a new session object
		// use the session object to SAVE the model object USERENTITY
		Session session = sessionFactory.openSession();

		// before we save the model object, we need to make a TRANSACTION
		// use the transaction to define a SINGLE unit of work
		session.beginTransaction();

		//to save the object
		session.save(user);

		// once you save the object, we need to end/close the transaction
		session.getTransaction().commit();

	}
}
