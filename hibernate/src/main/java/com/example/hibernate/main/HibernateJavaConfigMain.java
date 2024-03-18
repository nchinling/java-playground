package com.example.hibernate.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.example.hibernate.model.Employee1;
import com.example.hibernate.util.HibernateUtil;

public class HibernateJavaConfigMain {

	// public static void main(String[] args) {
	// 	Employee1 emp = new Employee1();
	// 	emp.setName("Chin Ling");
	// 	emp.setRole("Chairman");
	// 	emp.setInsertTime(new Date());
		
	// 	//Get Session
	// 	SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();
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