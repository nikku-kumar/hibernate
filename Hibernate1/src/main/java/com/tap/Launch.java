package com.tap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Launch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sessionzFactory = cfg.buildSessionFactory();
		Session session = sessionzFactory.openSession();
	
		
		
//		delete many rows
		 Transaction t = session.beginTransaction();
//		 Query query = session.createQuery("delete from Employee e where e.department='it'");
//		 int n =query.executeUpdate();
//		 System.out.println(n);
		
		

//		update all the data from table
//		Transaction t = session.beginTransaction();
//		Query query = session.createQuery("UPDATE Employee e SET e.salary=e.salary+5000 WHERE e.salary>30000");
//		int n = query.executeUpdate();
//		System.out.println(n);
		
		
		
//		print all the data from table
//		Query query = session.createQuery("from Employee e");
//		List list = query.getResultList();
//		for( Object o:list) {
//			System.out.println(o);
//		}
		
		
//		deleted the row
//		Employee e = session.get(Employee.class, 2);
//		session.delete(e);
//		
		
//		update the salary
//		Employee e = session.get(Employee.class, 2);
//		e.setSalary(50_000);
//		session.update(e);
		
		
		
		//print the data
//		Employee e = session.get(Employee.class, 2);
//		System.out.println(e);
		
		
		
		// insert the data 
//		Employee e = new Employee(1,"tim",20_000,"tim@gmail.com","developer");
//		Employee e1 = new Employee(2,"nikku",60_000,"nikku@gmail.com","developer");
//		Employee e2 = new Employee(3,"ankit",60_000,"ankit@gmail.com","it");
//		Employee e3 = new Employee(4,"bob",40_000,"bob@gmail.com","it");
		
//		session.save(e);
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		Transaction t = session.beginTransaction();
		t.commit();
		

		
	}

}
