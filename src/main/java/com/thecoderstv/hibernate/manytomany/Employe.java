package com.thecoderstv.hibernate.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employe {
	@Id
	private int id;

	private String employeeName;
	
	@ManyToMany
	@JoinTable(name = "emp_proj",
			joinColumns = {
					@JoinColumn(name="emp_id",referencedColumnName = "id")
			},
			inverseJoinColumns = {
					@JoinColumn(name="proj_id",referencedColumnName = "id")
			}
	)
	private List<Project> projects;
}
