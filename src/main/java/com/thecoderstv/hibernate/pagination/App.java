package com.thecoderstv.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.thecoderstv.hibernate.hql.Teacher;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Query q = ssn.createQuery("FROM Teacher");
		q.setFirstResult(12);
		q.setMaxResults(3);
		List<Teacher> list = q.list();
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
		
	}
}
