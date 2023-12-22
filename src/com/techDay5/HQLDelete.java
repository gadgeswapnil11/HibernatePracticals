package com.techDay5;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDelete {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("HibernateConnectivitDay3.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		String dquery = "Delete from Student where id=11";
		Query quer = session.createQuery(dquery);
		quer.executeUpdate();

		Student std = session.get(Student.class, 11);
		System.out.println(std); // IF it return null means Record Delete

	}

}
