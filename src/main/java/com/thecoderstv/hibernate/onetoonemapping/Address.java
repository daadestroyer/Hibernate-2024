package com.thecoderstv.hibernate.onetoonemapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int id;

	private String street;
	private String city;

	@OneToOne(mappedBy = "address")
	private User user;

}
