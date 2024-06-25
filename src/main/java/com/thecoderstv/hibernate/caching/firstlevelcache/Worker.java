package com.thecoderstv.hibernate.caching.firstlevelcache;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {
	@Id
	private int id;
	
	private String name;

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

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + "]";
	}
	
}
