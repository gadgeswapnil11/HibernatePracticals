package com.techDay6;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProjectionDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernateConnectivityDay6.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession(); 

		Criteria cr = session.createCriteria(Student.class);

		Projection pr = Projections.property("name");// name query it will return Id column values
		cr.setProjection(pr);

		List<Student> std = cr.list();
		System.out.println(std);

		/* ------ Projection with Restriction ------- */

		Projection pr1 = Projections.property("name");
	
		cr.setProjection(pr1);

		Criterion rs = Restrictions.eq("id", 2);   
		
		cr.add(rs);
		String str = (String) cr.uniqueResult();
		System.out.println(str);

		/* ------ Projection with Restriction ------- */

		System.out.println("/n   /n");

		Criteria crt = session.createCriteria(Student.class);

		Projection pr2 = Projections.property("name");
		cr.setProjection(pr2);

		Criterion cr1 = Restrictions.gt("id", 2);
		Criterion cr2 = Restrictions.le("id", 5);

		crt.add(cr1);
		crt.add(cr2);

		List<String> names = cr.list();
		System.out.println(names);

	}

}
