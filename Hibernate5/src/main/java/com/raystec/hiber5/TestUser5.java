package com.raystec.hiber5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestUser5 {

	public static void main(String[] args) throws Exception {
		
		//add();
		//update();
		//delete();
		get();
		
	}

	private static void get() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		User5 user = session.get(User5.class, 2);
		System.out.println(user.getId());
		System.out.println(user.getFirstname());
		System.out.println(user.getLastname());
		
		session.close();
		HibernateUtil.shutdown();
		
	}

	private static void delete() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		User5 user = new User5();
		user.setId(5);
		
		session.delete(user);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
		
		System.out.println("deleted");
		
	}

	private static void update() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		User5 user = new User5();
		user.setId(2);
		user.setFirstname("Ankit");
		user.setLastname("Mishra");
		
		session.update(user);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
		
		System.out.println("updated");
		
	}

	private static void add() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		User5 user = new User5();
		user.setFirstname("Gagan");
		user.setLastname("Sunahre");
		
		session.save(user);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
		
		System.out.println("inserted");		
	}
}
