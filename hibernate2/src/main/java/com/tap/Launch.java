package com.tap;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(CustomerDetails.class);
		cfg.addAnnotatedClass(Orders.class);
		Session session = cfg.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		
		
		
		
//		delete the customer  
		
		 Orders o1 = session.get(Orders.class, 506);
		 session.delete(o1);
		 
//		Customer c = session.get(Customer.class, 1);
//		session.delete(c);
		
		
		
		
		
		
//		reverse of many to one from customer find their order
//		 Customer c = session.get(Customer.class,1);
//		 System.out.println(c);
//		 System.out.println(c.getOrders());
		
		
//		get the data from table in many to one
//		Orders o1 = session.get(Orders.class, 501);
//		System.out.println(o1);
//		System.out.println(o1.getCustomer());
//		System.out.println(o1.getCustomer().getCustomerDetails());
		
		
//		 Customer ankit = new Customer(5,"ankit");
//		 CustomerDetails cd = new CustomerDetails(105,"patna", 9546, "patna");
//		 ankit.setCustomerDetails(cd);
		
		
//		many to one code crud operation
		
//		Orders O1 = new Orders(506, "veg_manchuriyan", 120);
//		Orders O2 = new Orders(507, "gulab_jamun", 50);
//		
		
//		Customer c = session.get(Customer.class,2);
//		O1.setCustomer(ankit);
//		O2.setCustomer(ankit);
//		
//		
//		
//		session.save(O1);
//		session.save(O2);
		
		
		
		
		
		
		
		
		
		
		
		
		//get from one row form customerdetails with the help of bideractional
//		CustomerDetails cd = session.get(CustomerDetails.class, 101);
//		Customer c = cd.getCustomer();
//		System.out.println(c);
//		
		
		
		
//		Customer c = session.get(Customer.class,1);
//		System.out.println(c);
//		CustomerDetails cd = c.getCustomerDetails();
//		System.out.println(cd);
//		
		
		
//		unidirectional
//		insert the data
//		Customer c = new Customer(4,"ankit");
//		CustomerDetails cd = new CustomerDetails(104,"ankit@gmail.com",896778,"btm-1st-stage");
//		c.setCustomerDetails(cd);
//		session.save(c);
		
		
		
		
		
		
		t.commit();
		
		
	}

}
