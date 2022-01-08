package com.raystec.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAdd {

	public static void main(String[] args) {
	//add();
	//update();
	//delete();
		Get();
	}
		
private static void Get() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		
		User pojo = (User)s.get(User.class, 1);
		
		System.out.println(pojo.getLname());
		System.out.println(pojo.getFname());
		
		s.close();
	}

private static void delete() {
		User pojo = new User();
		pojo.setId(5);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.delete(pojo);
		tx.commit();
		s.close();
		
		System.out.println("Deleted");
			
	}

private static void update() {
		User pojo = new User();
		pojo.setId(3);
		pojo.setFname("Aman");
		pojo.setLname("Sharma");
		pojo.setUserid("aman123");
		pojo.setPassword("12345");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.update(pojo);
		tx.commit();
		s.close();
		
		System.out.println("Updated");
			
		
	}

private static void add() {
			User pojo = new User();
			pojo.setFname("Gautam");
			pojo.setLname("Kumar");
			pojo.setUserid("gautam123");
			pojo.setPassword("12345");
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			
			s.save(pojo);
			tx.commit();
			s.close();
			
			System.out.println("Added");
				
	}

	
	}

