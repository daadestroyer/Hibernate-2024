package com.thecoderstv.hibernate.stateobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();
		
			// Creating object
		
		
			// as of now this state is in transient state because it is not yet associated with DB
			StudentTB studentTB = new StudentTB();
			studentTB.setId(101);
			studentTB.setName("Shubham");
			studentTB.setCity("Knp");
			studentTB.setCert(new Certificate("Java Full Stack"));
			
			
			// as of now this state is persistent stage here object is saved and associated with DB
			ssn.save(studentTB);
			
			
//			studentTB.setName("Peter"); here if before commiting if you change the name then this name will save in DB
// 			because as of now Shubham name is not associated with DB
			
			txn.commit();
			
			// as of now this is Detached State after this if you made any change it will not happen
			ssn.close();
			
			studentTB.setName("John");
			
			
			// as of now , this studentTB entity is no longer associated with DB is called as removed state
			txn = ssn.beginTransaction();
			ssn.delete(studentTB);
			txn.commit();
			
	}
}
