package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrives {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("HibernetConnectivity.xml");

		Employee emp = new Employee();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		emp.setId(4);
		emp.setName("Sohel");
		emp.setEmail("Sohel@gmail.com");

		int a = (int) session.save(emp); // It return Primary Key
		System.out.println(a);

		session.persist(emp);// Void Return Type

		Employee emp1 = new Employee();
		emp1.setEmail("SWPOtheking@gmail.com");

		emp1.setId(11);
		emp1.setName("Zensor");
		emp1.setEmail("SWPOtheking@gmail.com");

		session.saveOrUpdate(emp1); 
		//It will check Frist Primary key11 is present or  no if not present create new record and save elese
		//else it will update existPrimary key
		txn.commit();

	}

}
