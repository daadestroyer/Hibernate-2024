package com.thecoderstv.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRecords {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Student student = new Student();
		student.setName("Ram");
		student.setCity("Kanpur");
		student.setSalary(20000);
		student.setHobby("cricket");

		Student student2 = new Student();
		student2.setName("Shyam");
		student2.setCity("Delhi");
		student2.setSalary(21000);
		student2.setHobby("ps2");

		ssn.save(student);
        ssn.save(student2);
        txn.commit();

		
		
		
		
	}	
}
