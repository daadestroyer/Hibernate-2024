//package com.thecoderstv.hibernate.caching.secondlevelcache;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.thecoderstv.hibernate.crud.Student;
//
//
//public class App {
//	public static void main(String[] args) {
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session ssn1 = sessionFactory.openSession();
//		Transaction txn = ssn1.beginTransaction();
//		
//		
//		// first level
//		Worker w1 = ssn1.get(Worker.class, 101);
//		System.out.println(w1);
//		ssn1.close(); // first level cache ended
//		
//		// second		
//		Session ssn2 = sessionFactory.openSession();
//		Worker w2 = ssn1.get(Worker.class, 101);
//		System.out.println(w2);
//
//		ssn2.close();
//	}
//}
