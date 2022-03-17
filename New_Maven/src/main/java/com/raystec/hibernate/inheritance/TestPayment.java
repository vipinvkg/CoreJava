package com.raystec.hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPayment {

	public static void main(String[] args) {
		
		CreditCard c = new CreditCard();
		c.setId(1);
		c.setAmount(10000);
		c.setCcType("visa");
		
		Cheque a = new Cheque();
		a.setId(2);
		a.setChqNo(4356);
		a.setAmount(20000);
		a.setBankN("SBI");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		s.save(a);
		tx.commit();
		s.close();
		
		System.out.println("Inserted");
		
	}
}
