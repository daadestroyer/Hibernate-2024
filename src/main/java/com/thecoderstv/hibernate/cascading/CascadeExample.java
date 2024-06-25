package com.thecoderstv.hibernate.cascading;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadeExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Question q1 = new Question();
		q1.setId(1111);
		q1.setQuestion("What is cascading");

		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("Cascading allows related entities to be persisted automatically.");
		a1.setQuestion(q1);
		
		Answer a2 = new Answer();
		a2.setId(2);
		a2.setAnswer("Cascading can simplify code by handling related entity operations.");
		a2.setQuestion(q1);
		
		Answer a3 = new Answer();
		a3.setId(3);
		a3.setAnswer("Cascade types include ALL, PERSIST, MERGE, REMOVE, etc.");
		a3.setQuestion(q1);
		
		ArrayList<Answer> anslist = new ArrayList<Answer>();
		anslist.add(a1);
		anslist.add(a2);
		anslist.add(a3);
		
		q1.setAnswers(anslist); // at this point of time question will get saved in DB but its answers will not get saved 
								// in another db
		
//		ssn.save(q1);

		ssn.delete(q1);
		
		txn.commit();

	}
}
