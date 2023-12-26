package com.techDay6;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class RestrictionsDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernateConnectivityDay6.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Student.class);

		// Slect from * where id =4
		Criterion cr1 = Restrictions.eq("id", 4);
		cr.add(cr1);
		Student s1 = (Student) cr.uniqueResult();
		System.out.println(s1);

		/*------- select * form where id>2 and id<6 -----*/

		Criterion cr2 = Restrictions.gt("id", 2);
		Criterion cr3 = Restrictions.lt("id", 5);

		cr.add(cr2);
		cr.add(cr3);

		List<Student> std1 = cr.list();
		System.out.println(std1);

		/*------- select * form where id>2 -----*/

		Criterion cr4 = Restrictions.eq("course", "Java");
		cr.add(cr4);
		List<Student> std2 = cr.list();

		System.out.println(std2);

		for (Student std5 : std2) {
			System.out.println(std5.getCourse() + "  --  " + std5.getName());
		}

	}

}
