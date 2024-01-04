package ManyToManyPart2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "eid")
	private int id;

	@Column
	private String name;

	@Column
	private String email;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "employees_projects", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })

	Set<Project> projects2 = new HashSet<>(); // Give Project in Employee Sections

	
	public Set<Project> getProjects2() {
		return projects2;
	}

	public void setProjects2(Set<Project> projects2) {
		this.projects2 = projects2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
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

	public Employee() {

	}

}
