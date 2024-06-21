package com.thecoderstv.hibernate.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String projectName;

	@ManyToMany(mappedBy = "projects")
	private List<Employe> employees;
	
}
