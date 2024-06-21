package com.thecoderstv.hibernate.stateobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String name;

	
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Certificate(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
	
}
