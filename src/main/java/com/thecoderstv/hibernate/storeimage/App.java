package com.thecoderstv.hibernate.storeimage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction txn = openSession.beginTransaction();

		Product product = new Product();
		product.setpName("Laptop");

		// Read image
		FileInputStream fis = new FileInputStream("src/main/java/laptop.jpeg");

		// convert FileInputStream to byte array
		byte[] data = new byte[fis.available()];
		fis.read(data);

		product.setImage(data);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2024, Calendar.JUNE, 17);
		java.util.Date utilDate = calendar.getTime();

		product.setUtilDate(utilDate);

		openSession.save(product);
		txn.commit();

	}
}
