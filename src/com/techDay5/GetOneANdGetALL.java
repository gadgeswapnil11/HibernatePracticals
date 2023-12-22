package com.techDay5;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetOneANdGetALL {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("HibernateConnectivitDay3.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		System.out.println("/n  get one Data Below /n");

		String query = "from Student where id=1";
		Query eq = session.createQuery(query);
		List<Student> stdlist = eq.list();
		System.out.println(stdlist);
		/*------------ABOVE-GET ONLY ONE DATA--------------------------------------------*/
		System.out.println("/n  get all Uniqe Below /n");

		String query1 = "from Student where id=1";
		Query eq1 = session.createQuery(query1);
//		List<Student> stdlist1 = eq1.list();
		Student stdlist1 = (Student) eq1.uniqueResult();
		System.out.println(stdlist1);

		/*------------ABOVE-GET ALL DATA--------------------------------------------*/
		
		System.out.println("/n  get all Data Below /n");
		String query2 = "from Student ";
		Query eq2 = session.createQuery(query2);

		List<Student> stdlist2 = eq2.list();

		for (Student st : stdlist2) {
			System.out.println(st);

		}

	}

}
