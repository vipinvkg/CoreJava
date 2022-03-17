package com.raystec.hibernate;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test_Criteria {

	public static void main(String[] args) throws Exception {
		
		//criteria();
		//getparts_Restrictions();
		//SelectedAttribute_Projection();
	}

		private static void SelectedAttribute_Projection() {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session s = sessionfactory.openSession();
			Criteria criteria = s.createCriteria(User.class);
			ProjectionList p = Projections.projectionList();
			//p.add(Projections.property("id"));
			//p.add(Projections.property("fname"));
			
			criteria.setProjection(p);
            List list = criteria.list();
            
            System.out.println(list);
			}

		private static void getparts_Restrictions() {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session s = sessionfactory.openSession();
			Criteria criteria = s.createCriteria(User.class);
			criteria.add(Restrictions.like("lname","k%"));
			//criteria.add(Restrictions.eq("password", "12345"));
			//criteria.add(Restrictions.gt("id", 2));
			List<User> list = criteria.list();
			
			for (User u: list) {
				System.out.println(u.getId());
				System.out.println(u.getFname());
				System.out.println(u.getLname());
				System.out.println(u.getUserid());
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
		
	}

