package com.techHBAnnotation2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animals")
public class Animals {

	@Id
	@GeneratedValue
	int id;
	@Column
	String type;
	@Column 
	int legs;

	public Animals(String type, int legs) {
		this.type = type;
		this.legs = legs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Animals [id=" + id + ", type=" + type + ", legs=" + legs + "]";
	}

}
