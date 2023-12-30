package com.techOneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_db22")

public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "sid")
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "semail")
	private String email;

	@Column
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid")
	List<Address> addresses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
