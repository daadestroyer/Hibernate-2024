package com.thecoderstv.hibernate.lazyloading_eagerloading;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	private int id;
	private String itemName;

	@ManyToOne
	@JoinColumn(name = "carts_id", referencedColumnName = "id")
	private Carts carts;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Carts getCarts() {
		return carts;
	}

	public void setCarts(Carts carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemName=" + itemName + ", carts=" + carts + "]";
	}
	
	
}
