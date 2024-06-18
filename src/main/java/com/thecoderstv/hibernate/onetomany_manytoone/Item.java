package com.thecoderstv.hibernate.onetomany_manytoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	private int id;

	private String itemName;
	@ManyToOne
	@JoinColumn(name = "cart_id",referencedColumnName = "id")
	private Cart cart;
}
