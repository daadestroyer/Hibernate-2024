package com.thecoderstv.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "StudentTable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId")
	int id;

	@Column(name = "StudentName")
	String name;

	@Column(name = "StudentSal", nullable = true, unique = true)
	double salary;

	@Column(name = "StudentCity")
	String city;

	@Transient
	@Column(name = "StudentHobbie")
	String hobby;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Student(int id, String name, double salary, String city, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", hobby=" + hobby
				+ "]";
	}

	
}
