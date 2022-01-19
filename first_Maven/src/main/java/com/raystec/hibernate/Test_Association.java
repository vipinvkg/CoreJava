package com.raystec.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Association {
	
	public static void main(String[] args) {

		AuctionItem_Association_OnetoMany item = new AuctionItem_Association_OnetoMany();
		item.setDescription("Audi");
		
		Bid_OnebyMany bid1 = new Bid_OnebyMany();
		bid1.setAmount(50000);
		
		Bid_OnebyMany bid2 = new Bid_OnebyMany();
		bid2.setAmount(100000);

		Bid_OnebyMany bid3 = new Bid_OnebyMany();
		bid3.setAmount(200000);
		
		Set bids = new HashSet();
		bids.add(bid1);
		bids.add(bid2);
		bids.add(bid3);
		item.setBids(bids);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(item);
		tx.commit();
		s.close();
		
		System.out.println("Added");
	}


}
