package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;

public abstract class StudentService implements StudentDAO {

	EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("SMSDB"); // hql entity manager?
	EntityManager session = sessionFactory.createEntityManager(); // hql > sql method manager?

	// This method reads the student table in your database and returns the data as
	// a List<Student>
	public List<StudentDAO> getAllStudents() {
		Query query = session.createQuery("SELECT * FROM Student");
		List<StudentDAO> studentList = query.getResultList();
		return studentList;
	}

	// This method takes a Student’s email as a String and parses the student list
	// for a Student with that email and returns a Student Object.
	public StudentDAO getStudentByEmail(String sEmail) {
		StudentDAO student = null;
		Query query = session.createQuery("SELECT * FROM Student WHERE email = :email").setParameter("email", sEmail);
		student = (StudentDAO) query.getSingleResult();
		return student;
	}

}
