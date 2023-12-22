package com.techDay5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAndLoad {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("HibernateConnectivitDay3.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Student std = session.get(Student.class, 1);// it will work on same line
		System.out.println(std);
		System.out.println(std.getName());
		System.out.println(std.getEmail());
		System.out.println(std.getId());

		System.out.println("before load----");
		Student std1 = session.load(Student.class, 2);// It will executed on work Non primary Key line
		System.out.println("after load----");
		System.out.println(std1);

		System.out.println(std1.getId());
		System.out.println(std1.getName());// Query fire on frist Primary key
		System.out.println(std1.getEmail());
		System.out.println(std1.getCourse());
		

	}

}
