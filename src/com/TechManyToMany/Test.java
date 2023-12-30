package com.TechManyToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("ManyToMany.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		HashSet<Project> projects = new HashSet<>();

		Project project = new Project();
		project.setName("JAVA Developer");

		Project project1 = new Project();
		project1.setName("Spring Developer");

		projects.add(project);
		projects.add(project1);

		Employee e1 = new Employee();
		e1.setName("MS");
		e1.setProjects(projects);// project object complete here

		Set<Employee> employees = new HashSet<>();

		employees.add(e1);
		
		project.setEmployees(employees);// project object complete here

		project1.setEmployees(employees);// project1 object complete here

		session.save(e1);
		session.save(project);
		session.save(project1);
		txn.commit();

	}

}
