package com.example.Example_ManyToOneCascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.DepartmentEntity;
import entity.TeacherEntity;

public class Main {

	public static void main(String[] args) {
		// starting a new session connection in MAIN
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
//		//  create a new session
//		DepartmentEntity it_dept = new DepartmentEntity();
//		it_dept.setDeptName("IT");  // setting the it_dept name
//		
//		DepartmentEntity hr_dept = new DepartmentEntity();
//		hr_dept.setDeptName("HR");  // setting the it_dept name
		
		// EXERCISE: create four new teachers
		TeacherEntity t1 = new TeacherEntity();  // teacher 1
		t1.setTeacherName("Pirate Hunter Roronoa");
		t1.setSalary("320,000,000");
		//t1.setDepartmentEntity(it_dept);
		TeacherEntity t2 = new TeacherEntity();  // teacher 2
		t2.setTeacherName("Cat-Burlgar Nami");
		t2.setSalary("66,000,000");
		//t2.setDepartmentEntity(it_dept);
		TeacherEntity t3 = new TeacherEntity();  // teacher 3
		t3.setTeacherName("God/King Usopp");
		t3.setSalary("200,000,000");
		//t3.setDepartmentEntity(hr_dept);
		TeacherEntity t4 = new TeacherEntity();  // teacher 4
		t4.setTeacherName("Tony-Tony Chopper");
		t4.setSalary("100?");
		//t4.setDepartmentEntity(hr_dept);
		
		// save each session
		//session.save(hr_dept);
		//session.save(it_dept);
		List<TeacherEntity> teacherList = new ArrayList<>();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		
		// create new department
		DepartmentEntity dept = new DepartmentEntity();
		dept.setDeptName("Worst Generation");
		dept.setTeacherList(teacherList);
		
		session.save(dept);
		
		t.commit();  //commit the session
		session.close();  //close the session

	}

}
