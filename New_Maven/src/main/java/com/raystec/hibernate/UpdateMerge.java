package com.raystec.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UpdateMerge {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		User u = (User) s.get(User.class, 1);
		System.out.println(u.getFname());
		
		s.close();
		u.setFname("Surendra");
		Session s1 = sessionfactory.openSession();
		User u1 = (User) s1.get(User.class, 1);
		Transaction tx = s1.beginTransaction();
		
		//s1.update(u);
		s1.merge(u);
		tx.commit();
	
	}
}
