package com.thecoderstv.hibernate.lazyloading_eagerloading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Carts carts1 = new Carts();
		carts1.setId(101);
		carts1.setCartName("Clothing");

		Carts carts2 = new Carts();
		carts2.setId(102);
		carts2.setCartName("Electronics");

		Carts carts3 = new Carts();
		carts3.setId(103);	
		carts3.setCartName("Grocery");

		Items items1 = new Items();
		items1.setId(1);
		items1.setItemName("Tshirt");
		items1.setCarts(carts1);

		Items items2 = new Items();
		items2.setId(2);
		items2.setItemName("Mobile");
		items2.setCarts(carts2);
		
//		ssn.save(carts1);
//		ssn.save(carts2);
//		ssn.save(carts3);
//		ssn.save(items1);
//		ssn.save(items2);
		
		// lazy loading
		Carts carts = ssn.get(Carts.class, 101); 
//		System.out.println(carts); // error will come here because items array list is not present
		
		// eager loading
//		Carts carts = ssn.get(Carts.class, 101); 
		 
//		txn.commit();
		
	}

}
