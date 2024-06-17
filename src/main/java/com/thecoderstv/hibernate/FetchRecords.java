package com.thecoderstv.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchRecords {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Student student = new Student();

		// get
		// if object is not found it will return null
		// it will get the object and map all the records in the object
		
//		 Student loadedStudentGet1 = ssn.get(Student.class, 302);
//		 Student loadedStudentGet2 = ssn.get(Student.class, 302);
		// System.out.println(loadedStudentGet1);
		// System.out.println(loadedStudentGet2);
		
		
		
		// load
		// if object is not found it will give ObjectNotFoundException
		// it will just get the dummy object and later on when you use the object then it will map all it values
		
		 Student loadedStudentLoad1 = ssn.load(Student.class, 302);
		 System.out.println(loadedStudentLoad1);
		 
		 
		
	}
}
