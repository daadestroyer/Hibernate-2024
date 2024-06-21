package com.thecoderstv.hibernate.stateobjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentTB {
	@Id
	private int id;
	private String name;
	private String city;
	private Certificate cert;

	public StudentTB() {
		super();

	}

	public StudentTB(int id, String name, String city, Certificate cert) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cert = cert;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certificate getCert() {
		return cert;
	}

	public void setCert(Certificate cert) {
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "StudentTB [id=" + id + ", name=" + name + ", city=" + city + ", cert=" + cert + "]";
	}

}
