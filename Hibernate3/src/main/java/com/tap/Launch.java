package com.tap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {
	
	
     @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Project.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		
	    Employee e = session.load(Employee.class, 2);
		System.out.println(e);
		

		
//		remove one project
//		Project p = session.get(Project.class, 2);
//		session.delete(p);
		
		
		
		
//		remove one employee
//		Employee emp = session.get(Employee.class, 1);
//		session.delete(emp);
//		
		
		
//		get the details by the help of project
//		Project p = session.get(Project.class, 2);
//		System.out.println(p);
//	    List <Employee>emp = p.getEmployees();
//	   Iterator<Employee> itr = emp.iterator();
//	   while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	   
		
//		get the details by the help of from employee
//		Employee raj = session.get(Employee.class, 1);
//		
//		System.out.println(raj);
//        List<Project>  project = raj.getProjects();
//		Iterator itr = project.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		
//		employee ready
//		Employee raj = new Employee(1, "raj");
//		Employee kumar = new Employee(2, "kumar");
//		
		
		
//		project ready
//		Project docx = new Project(1, "google_docx");
//		Project slide = new Project(2, "google_slide");
//		
//		ArrayList<Project> al1 = new ArrayList<Project>();
//		al1.add(docx);
//		al1.add(slide);
//		
//		raj.setProjects(al1);
//		kumar.setProjects(al1);
//		
//		session.save(raj);
//		session.save(kumar);
//		session.save(docx);
//		session.save(slide);
//		
		
		t.commit();
		
	}
	

}
