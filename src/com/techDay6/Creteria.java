package com.techDay6;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Creteria {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernateConnectivityDay6.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();


		/*------- Creterea  -------*/
		/*--- select * from table */

		Criteria cr = session.createCriteria(Student.class);
		List<Student> std = cr.list();
		System.out.println(std);

		for (Student s1 : std) {
			System.out.println(s1.getName());

		}

		// Only even Id Records

		for (Student s1 : std) {

			if (s1.getId() % 2 == 0) {
				System.out.println(s1.getEmail());

			}

		}

		
		

	}

}
