package com.raystec.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test_NamedQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionfactory.openSession();
		
		Query q = s.getNamedQuery("allUser");
		
		List l = q.list();
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			User u = (User) it.next();
			System.out.print(u.getFname());
			System.out.println("\t"+u.getLname());
		}
	}
}
