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

public class ProjectionMethods {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernateConnectivityDay6.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);

		Projection pr = Projections.avg("id");
		cr.setProjection(pr);

		Double avgValue = (Double) cr.uniqueResult();
		System.out.println(avgValue);

		 
		
		
		
	}

}
