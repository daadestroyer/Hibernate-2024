package com.thecoderstv.hibernate.onetomany_manytoone;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int id;
	private String cartName;
	
	@OneToMany(mappedBy = "cart")
	private List<Item> items;
}
