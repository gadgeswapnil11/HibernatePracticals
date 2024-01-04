package com.HBAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hb.Annotation.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();// table created here

		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();

		Employee_DbHb s1 = new Employee_DbHb(1, "aa", "aa@gmail.com");
		Employee_DbHb s2 = new Employee_DbHb(2, "bb", "bb@gmail.com");
		Employee_DbHb s3 = new Employee_DbHb(3, "cc", "cc@gmail.com");
		Employee_DbHb s4 = new Employee_DbHb(4, "dd", "dd@gmail.com");
		Employee_DbHb s5 = new Employee_DbHb(5, "ee", "ee@gmail.com");

		Employee_DbHb s6 = new Employee_DbHb(6, "ff", "ff@gmail.com");
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		txn.commit();

	}

	protected void adds() {
		System.out.println("Hello Protected");
	} 

}
