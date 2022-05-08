package com.example.Example_ManyToOneCascade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.CohortEntity;
import entity.DepartmentEntity;
import entity.TeacherEntity;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		/*-- ManyToOne Relationship --
		
		Department dep = new Department();
		dep.setDepartmentName("IT");
		
		Department dep2 = new Department();
		dep2.setDepartmentName("HR");
		
		Teacher t1 = new Teacher();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHaseeb");
		
		Teacher t2 = new Teacher();
		t2.setDepartment(dep);
		t2.setSalary("2220");
		t2.setTeacherName("Shahparan");
		
		Teacher t3 = new Teacher();
		t3.setDepartment(dep);
		t3.setSalary("30000");
		t3.setTeacherName("James");
		
		Teacher t4 = new Teacher();
		t4.setDepartment(dep2);
		t4.setSalary("40000");
		t4.setTeacherName("Joseph");
		
		session.save(dep);
		session.save(dep2);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		
		t.commit();*/

//		-- OneToMany Relationship --

//		TeacherEntity t1 = new TeacherEntity();
//		t1.setTeacherName("Roronoa");
//		t1.setSalary("100");
//
//		TeacherEntity t2 = new TeacherEntity();
//		t2.setTeacherName("Nico Robin");
//		t2.setSalary("10000");
//
//		TeacherEntity t3 = new TeacherEntity();
//		t3.setTeacherName("Ton-Tony Chopper");
//		t3.setSalary("25000");
//
//		TeacherEntity t4 = new TeacherEntity();
//		t4.setTeacherName("Jimbei");
//		t4.setSalary("3000");
//
//		TeacherEntity t5 = new TeacherEntity();
//		t5.setSalary("200");
//		t5.setTeacherName("Brook");
//
//		// Add teacher entity object to the list
//		List<TeacherEntity> teachlist = new ArrayList<>();
//		teachlist.add(t1);
//		teachlist.add(t2);
//		teachlist.add(t3);
//		teachlist.add(t4);
//		teachlist.add(t5);
//		session.save(t1);
//		session.save(t2);
//		session.save(t3);
//		session.save(t4);
//		session.save(t5);
//		
//
//		// Create Department
//		DepartmentEntity department = new DepartmentEntity();
//		department.setDeptName("Development");
//		department.setTeacherList(teachlist);

		// =====MANY TO MANY======
		CohortEntity c1 = new CohortEntity();
		c1.setCohortName("Straw Hat");
		c1.setDuration("30 years");

		CohortEntity c2 = new CohortEntity();
		c2.setCohortName("Heart");
		c2.setDuration("30 years");

		CohortEntity c3 = new CohortEntity();
		c3.setCohortName("Whole Cake");
		c3.setDuration("200 years");

		// Store Cohort
		session.save(c1);
		session.save(c2);
		session.save(c3);

		// class set 1
		// what is this set doing or creating again?
		Set<CohortEntity> classSetOne = new HashSet<>();
		classSetOne.add(c1);
		classSetOne.add(c2);
		classSetOne.add(c3);

		// class set 2
		Set<CohortEntity> classSetTwo = new HashSet<>();
		classSetTwo.add(c3);
		classSetTwo.add(c1);
		classSetTwo.add(c2);

		// class set 3
		Set<CohortEntity> classSetThr = new HashSet<>();
		classSetThr.add(c3);
		classSetThr.add(c2);
		classSetThr.add(c1);

		TeacherEntity t1000 = new TeacherEntity();
		t1000.setTeacherName("Crocodile");
		t1000.setCohortSet(classSetOne);

		TeacherEntity t2000 = new TeacherEntity();
		t2000.setTeacherName("Mr. 1");
		t2000.setCohortSet(classSetTwo);

		TeacherEntity t3000 = new TeacherEntity();
		t3000.setTeacherName("Mr. 3");
		t3000.setCohortSet(classSetThr);

		// Store Teacher
		session.save(t1000);
		session.save(t2000);
		session.save(t3000);

		t.commit();
		session.close();

	}
}