package com.thecoderstv.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.processing.SQL;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Teacher teacher = new Teacher();
		teacher.setName("dinesdssddddfdfdh");
		teacher.setCity("mirsdszdfdfddapur");
		teacher.setSal(400022233);
		ssn.save(teacher);
		txn.commit();
//		// SELECT all the records (select * from teacher)
//		Query q = ssn.createQuery("FROM Teacher");
//		List<Teacher> list = q.list();
//		for (Teacher teacher : list) {
//			System.out.println(teacher);
//		}

//		System.out.println("------------");
//		// SELECT all the records on basis of id 
//		Query q1 = ssn.createQuery("FROM Teacher where id=:x");
//		q1.setParameter("x", 1);
//		Teacher teacher = (Teacher) q1.uniqueResult();
//		System.out.println(teacher);
		
//		System.out.println("------------");
//		// SELECT records on the basis of two conditions 
//		Query q2= ssn.createQuery("FROM Teacher where city=:c AND sal>:s");
//		q2.setParameter("c", "kanpur");
//		q2.setParameter("s", 45000);
//		
//		Teacher teacher2 = (Teacher) q2.uniqueResult();
//		System.out.println(teacher);
		
//		System.out.println("------------");
//		// delete records on the  
//		Query q3= ssn.createQuery("DELETE from Teacher where city=:c AND sal<:s");
//		q3.setParameter("c", "delhi");
//		q3.setParameter("s", 200000);
//		int r = q3.executeUpdate();
//		System.out.println("deleted");
//		
//		txn.commit();
		
//		System.out.println("------------");
//		// min salary  
//		Query q4= ssn.createQuery("SELECT min(sal) from Teacher");
//		Object uniqueResultMin = q4.uniqueResult();
//		System.out.println(uniqueResultMin);
		
		
//		System.out.println("------------");
//		// max salary  
//		Query q5= ssn.createQuery("SELECT max(sal) from Teacher");
//		Object uniqueResultMax = q5.uniqueResult();
//		System.out.println(uniqueResultMax);
		
	}
}
