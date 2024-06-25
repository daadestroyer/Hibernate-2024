package com.thecoderstv.hibernate.nativesql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.thecoderstv.hibernate.hql.Teacher;

public class App {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		// HQL Query
//		Query q = ssn.createQuery("FROM Teacher");

		// Native SQL Select Query
		NativeQuery<Teacher> q = ssn.createNativeQuery("select * from Teacher").addEntity(Teacher.class);
		List<Teacher> list = q.list();
		for (Teacher t : list) {
			System.out.println(t);
		}
	}
}
