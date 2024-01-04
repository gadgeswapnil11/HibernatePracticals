package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HBAnnotation.day1;

public class Delete  {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("HibernetConnectivity.xml");
		Employee emp = new Employee();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();

		emp.setId(2);
		session.delete(emp);
		txn.commit();
		
		
	
		
		
		
	}
	
	
}
