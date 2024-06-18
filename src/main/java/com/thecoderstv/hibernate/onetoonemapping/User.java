package com.thecoderstv.hibernate.onetoonemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	
	@OneToOne
	@JoinTable(name = "user_addr",
		joinColumns = {
				@JoinColumn(name="user_id",referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name="addr_id",referencedColumnName = "id")
		}
	)
	private Address address;
}
