package com.TechManyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects_11")
public class Project {

	@Id
	@Column(name = "project_id")
	@GeneratedValue
	private int id;
	@Column(name = "pname")
	private String name;
	
	@ManyToMany(mappedBy = "projects", cascade = { CascadeType.ALL })
	private Set<Employee> employees = new HashSet<Employee>();

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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	
}
