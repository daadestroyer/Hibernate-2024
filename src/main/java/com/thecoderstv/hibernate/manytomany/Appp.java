package com.thecoderstv.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();
		System.out.println("*** Project Started ***");
	}
}
