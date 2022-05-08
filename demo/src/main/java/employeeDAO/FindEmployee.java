package employeeDAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.EmployeeEntity;

public class FindEmployee {
	public void findEmp() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// open the session we want to run
		Session session = factory.openSession();

		// transactions, what do we want to do
		Transaction t = session.beginTransaction();

		// this is accessing out object
		// a new package where we want data accessed from objects
		// string session FROM
		// setting a finder?
		String findUserString = "FROM EmployeeEntity";
		// create a query to find the users for us
		Query q = session.createQuery(findUserString);
		// this creates our table
		EmployeeEntity employeeEntity = new EmployeeEntity();
		//
		List<EmployeeEntity> resultsEmployeeEntity = q.getResultList();
		// for loop for list
		for (EmployeeEntity e : resultsEmployeeEntity) {
			System.out.println("user id: " + e.getEmp_id() + " first name: " + e.getFirstName());
		}
	}
}
