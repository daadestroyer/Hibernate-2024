package com.thecoderstv.hibernate.dependentclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session ssn = sessionFactory.openSession();
		Transaction txn = ssn.beginTransaction();

		Address address = new Address();
		address.setCity("Kanpur");
		address.setCountry("India");
		address.setPincode("208006");
		
		Department department = new Department();
		department.setDeptId(1001);
		department.setDeptName("IT DEPT");
		
		Employee employee = new Employee();
		employee.setName("ram");
		employee.setSalary(100000);
		employee.setAddress(address);
		employee.setDepartment(department);
		
		//ssn.save(employee);
		
		Employee loadedEmployee = ssn.get(Employee.class, 1);
		System.out.println(loadedEmployee);
		txn.commit();
	}
}
