package com.thecoderstv.hibernate.caching.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();
	
		Worker worker = new Worker();
		worker.setId(101);
		worker.setName("Ram Singh");
		
		//ssn.save(worker);
		//txn.commit();
		
		Worker savedWorker1 = ssn.get(Worker.class, 101);
		System.out.println(savedWorker1);

		// working something
		
		ssn.close(); // but if you close the cache you will not be able to fetch again
		

		if(ssn.contains(savedWorker1)) {
			System.out.println("worker object is present in first level cache");
		}
		else {
			System.out.println("worker object is not present in first level cache");
		}

		// here you can notice select query run only one time
		Worker savedWorker2 = ssn.get(Worker.class, 101);
		System.out.println(savedWorker2);
		
		
		
		
	}
}
