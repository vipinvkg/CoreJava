package com.raystec.hiber5;


	import java.util.Iterator;
	import java.util.List;

	import javax.persistence.Query;
	import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.persistence.criteria.Root;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;

	
	public class TestCriteria {

		public static void main(String[] args) throws Exception {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();

		
			CriteriaBuilder builder = session.getCriteriaBuilder();
		
			CriteriaQuery<User5> query = builder.createQuery(User5.class);
			
			Root<User5> root = query.from(User5.class);
			query.select(root).where(builder.equal(root.get("id"), 1));
			
			Query q = session.createQuery(query);
			
			List<User5> user = q.getResultList();
			
			Iterator<User5> list = user.iterator();
			
			while (list.hasNext()) {
				User5 u = (User5) list.next();
				System.out.println(u.getId());
				System.out.println(u.getFirstname());
				System.out.println(u.getLastname());
			}

		}
	}
