package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import com.mysql.cj.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory =new Configuration()
				.configure("hibernate.cfg.xml");
		         .addAnnotatedClass(Student.class);
		         .buildSessionFactory();
		         
		//create session
		         Session session =factory.getCurrentSession();
		         
		         try {
		        	 //use the session object to save java object
		        	 
		        	 //create student object 
		        	 System.out.println("creating new student obj ");
		        	 Student tempStudent = new Student("eman","amr","eman@gmail.com");
		        	 //start a transaction
		        	 session.beginTransaction();
		        	 
		        	 //save the student object 
		        	 System.out.println("saving the student ");
		        	 session.save(tempStudent);
		        	 //commit the transaction
		        	 session.getTransaction().commit();
		        	 System.out.println("Done ");
		         }
		         finally {
		        	 factory.close();
		         }
	}

}
