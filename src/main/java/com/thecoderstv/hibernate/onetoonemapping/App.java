package com.thecoderstv.hibernate.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.getTransaction();
		System.out.println("*** Program Started ***");
		
		
		
	}

}
