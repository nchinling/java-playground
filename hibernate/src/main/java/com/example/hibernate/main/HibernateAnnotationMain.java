package com.example.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.hibernate.model.Employee1;
import com.example.hibernate.util.HibernateUtil;

public class HibernateAnnotationMain {

	// public static void main(String[] args) {
	// 	Employee1 emp = new Employee1();
	// 	emp.setName("Ling");
	// 	emp.setRole("Senior Software Engineer");
	// 	emp.setInsertTime(new Date());
		
	// 	//Get Session
	// 	SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
	// 	Session session = sessionFactory.getCurrentSession();
	// 	//start transaction
	// 	session.beginTransaction();
	// 	//Save the Model object
	// 	session.save(emp);
	// 	//Commit transaction
	// 	session.getTransaction().commit();
	// 	System.out.println("Employee ID="+emp.getId());
		
	// 	//terminate session factory, otherwise program won't end
	// 	sessionFactory.close();
	// }

}