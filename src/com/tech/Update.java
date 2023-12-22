package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("HibernetConnectivity.xml");
		Employee emp = new Employee();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();

		emp.setId(3);
		emp.setName("Abhya Rathod");
		session.update(emp);
		
		txn.commit();
		
		Employee e=session.get(Employee.class, 3);
		System.out.println(e);

		
		
		
	}

}
