package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("HibernetConnectivity.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Employee e=session.get(Employee.class, 1); 
		System.out.println(e);
		
		
	}

}
