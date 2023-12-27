package com.HBAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeHbDb")

public class Employee_DbHb {
	public Employee_DbHb(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}

	@Id
	int id;
	@Column(name = "ename")
	String name;
	@Column
	String mail;

	@Override
	public String toString() {
		return "Employee_DbHb [id=" + id + ", name=" + name + ", mail=" + mail + "]";
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
