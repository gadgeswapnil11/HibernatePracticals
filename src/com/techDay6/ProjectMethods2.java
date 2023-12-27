package com.techDay6;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();

		cfg.configure("hibernateConnectivityDay6.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);

		cr.setProjection(Projections.sum("id"));

		long sum = (long) cr.uniqueResult();
		System.out.println(sum);

		cr.setProjection(Projections.count("id"));
		long sum1 = (long) cr.uniqueResult();
		System.out.println(sum1);

		cr.setProjection(Projections.min("id"));
		int min = (int) cr.uniqueResult();
		System.out.println(min);

		cr.setProjection(Projections.max("id"));
		int max = (int) cr.uniqueResult();
		System.out.println(max);

		cr.setProjection(Projections.countDistinct("id"));
		List<Student> s1 = cr.list();
		System.out.println(s1);  
		
		
		
	}

}
