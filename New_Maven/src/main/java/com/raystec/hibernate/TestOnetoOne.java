package com.raystec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOnetoOne {

	public static void main(String[] args) {
		
		Address a = new Address();
		a.setStreet("Madhu");
		a.setCity("indore");
		a.setState("Mp");
		
		Employeehiber emp = new Employeehiber();
		emp.setFname("vipin");
		emp.setLname("gupta");
		emp.setEmpaddr(a);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(emp);
		tx.commit();
		s.close();
		
		System.out.println("Inserted");
		
	}
}
