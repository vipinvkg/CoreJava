package com.raystec.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {
	add();
	//update();
	//delete();
	//Get();
	//PrintSingleAttrbute();
	//PrintMultipleAttribute();
	//criteria();
	//ListofUser();
		
	}

private static void ListofUser() {
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session s = sessionfactory.openSession();
	
	Query q = s.createQuery("from User");//its also print entire table.
	List l = q.list();
	Iterator it = l.iterator();
	
	User pojo;
	while (it.hasNext()) {
		pojo = (User) it.next();
		System.out.print(pojo.getId());
		System.out.print(pojo.getFname());
		System.out.print(pojo.getLname());
		System.out.print(pojo.getUserid());
		System.out.println(pojo.getPassword());
	}
		
	}

private static void criteria() {
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session s = sessionfactory.openSession();
	Criteria criteria = s.createCriteria(User.class);//its print entire table.
	List<User> list = criteria.list();
	Iterator<User> it = list.iterator();
	while (it.hasNext()) {
		User u = (User) it.next();
		
		System.out.print(u.getId());
		System.out.print(" "+u.getFname());
		System.out.print(" "+u.getLname());
		System.out.print(" "+u.getUserid());
		System.out.println(" "+u.getPassword());
	}
		
	}

private static void PrintMultipleAttribute() {
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session s = sessionfactory.openSession();
	
	Query q = s.createQuery("select u.id,u.fname,u.lname from User u");// its print all selected attribute of table "user".
	List list = q.list();
	Iterator it = list.iterator();
		while (it.hasNext()) {
			Object[] u  = (Object[]) it.next();
			System.out.print(u[0]);
			System.out.print(u[1]);
			System.out.println(u[2]);
		}
	}

private static void PrintSingleAttrbute() {
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session s = sessionfactory.openSession();
	
	Query q = s.createQuery("select u.lname from User u");// its print all fname of table "user".
	List list = q.list();
	Iterator it = list.iterator();
	while (it.hasNext()) {
		String u = (String) it.next();
		System.out.println(u);
	}
		
	}

private static void Get() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		
		User pojo = (User)s.get(User.class, 1);// it will get the details of id 1
		
		System.out.println(pojo.getLname());
		System.out.println(pojo.getFname());
		
		s.close();
	}

private static void delete() {
		User pojo = new User();
		pojo.setId(4);
		
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
		pojo.setId(4);
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
			pojo.setFname("Amit");
			pojo.setLname("Kumar");
			pojo.setUserid("Amit123");
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

