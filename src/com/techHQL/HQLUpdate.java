package com.techHQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techDay5.Student;

public class HQLUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("HibernateConnectivitDay3.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		String query = "Update Student set name='Vaishnavi' where id=18";

		Query hqlQ = session.createQuery(query);

		int a = hqlQ.executeUpdate();
		System.out.println(a);
		txn.commit();
		Student std = session.get(Student.class, 18);
		System.out.println("Value Updated" + std);
		/*----------------------------------------------------------------------*/
		String hql = "Update Student set name='Avinash', email='Avi@gmail.com',course='MBA'where id=3";
		Query q2 = session.createQuery(hql);
		int c = q2.executeUpdate();
		System.out.println(c);
		Student std3 = session.get(Student.class, 3);
		System.out.println(std3);
		/*----------------------------------------------------------------------*/

		Transaction txn1 = session.beginTransaction();
		String query1 = "Update Student set id=2 where id=18";
		Query hlq1 = session.createQuery(query1);
		int b = hlq1.executeUpdate();
		System.out.println(b);
		Student std1 = session.get(Student.class, 2);
		System.out.println(" Key Updated " + std1);

	}
}
