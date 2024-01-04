package ManyToManyPart2;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestExecution {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("ManyToManyPart2.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		
		Project project = new Project(); 
		project.setpName("Java");

		Project project1 = new Project();
		project1.setpName("Python");

		Set<Project> projects2 = new HashSet<>();
		projects2.add(project);
		projects2.add(project1);

		Employee emp = new Employee();
		emp.setName("Swapnil");
		emp.setEmail("Swapnil@gmail.com");
		emp.setProjects2(projects2);

		Employee emp1 = new Employee();
		emp1.setName("Avinash");
		emp1.setEmail("Avinash@gmail.com");
		emp1.setProjects2(projects2);

		Set<Employee> empset = new HashSet<>();
		empset.add(emp);
		empset.add(emp1);

		session.save(project1);
		session.save(project);
		session.save(emp);
		session.save(emp1);
		txn.commit(); 
	}

}
