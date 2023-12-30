package com.techOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("OneToMany.xml");
		
		SessionFactory sessionFactory= cfg.buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		Address address= new Address();
		address.setCityname("Pune");
		address.setPincode("1111");
		
		Address address1= new Address();
		address1.setCityname("Mumbai");
		address1.setPincode("2222");
		
		Student s1 = new Student();
		s1.setName("MS");
		s1.setEmail("ms@gmail.com");
		
		List<Address> addlist= new ArrayList<Address>();
		addlist.add(address);
		addlist.add(address1);
		
		s1.setAddresses(addlist);
		
		session.save(s1);
		session.save(address);
		session.save(address1);
		
		txn.commit();
		

	}
}
