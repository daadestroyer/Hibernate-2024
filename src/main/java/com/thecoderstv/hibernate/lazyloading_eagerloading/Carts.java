package com.thecoderstv.hibernate.lazyloading_eagerloading;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Carts {
	@Id
	private int id;
	private String cartName;
	
	@OneToMany(mappedBy = "carts",fetch = FetchType.LAZY)
	private List<Items> items;

	public Carts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Carts [id=" + id + ", cartName=" + cartName + ", items=" + items + "]";
	}
	
	
}
