package com.example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.hibernate.model.Employee1;
import com.example.hibernate.util.HibernateUtil;

public class ListAllMain {
     public static void main(String[] args) {
        //Get Session
        SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();
        Session session = sessionFactory.getCurrentSession();
        
        try {
            //start transaction
            session.beginTransaction();
            
            // Retrieve list of employees using HQL
            // Query<Employee1> query = session.createQuery("FROM Employee1");
            // List<Employee1> employees = query.getResultList();
            // List<Employee1> employees = new ArrayList<>();
            List<Employee1> employees = session.createCriteria(Employee1.class).list();

            // Print the list of employees
            for (Employee1 employee : employees) {
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Employee Name: " + employee.getName());
                System.out.println("Employee Role: " + employee.getRole());
                System.out.println("Employee Insert Time: " + employee.getInsertTime());
                System.out.println("--------------------------------------------");
            }
            
            //Commit transaction
            session.getTransaction().commit();
        } catch (Exception ex) {
            // Handle exceptions
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            // Close session factory
            sessionFactory.close();
        }
    }
}
