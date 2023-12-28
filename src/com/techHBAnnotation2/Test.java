package com.techHBAnnotation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hb.Annotation2.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction txn = session.beginTransaction();

		Animals a1 = new Animals("Dog", 4);
		Animals a2 = new Animals("Cat", 4);
		Animals a3 = new Animals("Cow", 4);
		Animals a4 = new Animals("Bull", 4);
		Animals a5 = new Animals("Tiger", 4);

		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		session.save(a5);

		txn.commit();

		Animals s1=	session.get(Animals.class, 1);
		
		System.out.println(s1);  
		
	}

}
