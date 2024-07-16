package com.luv2code.hibernate.demo;

import java.lang.module.Configuration;

import com.luv2code.hibernate.demo.entity.Student;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

public class ReadStudentDemo {
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
			        	 Student tempStudent = new Student("toqa","amr","toqa@gmail.com");
			        	 
			        	 //start a transaction
			        	 session.beginTransaction();
			        	 
			        	 //save the student object 
			        	 System.out.println("saving the student ");
			        	 System.out.println(tempStudent);
			        	 session.save(tempStudent);
			        	 
			        	 //commit the transaction
			        	 session.getTransaction().commit();
			        	 
			        	 /*********************/
			        	 
			        	 //find out the student's id : primary key
			        	 System.out.println("saved student.generated id : "+ tempStudent.getId());
			        	 
			        	 //now get a new session and start transaction
			        	 session =factory.getCurrentSession();
			        	 session.beginTransaction();
			        	 
			        	 
			        	 //retrieve student based on the id : primary key
			        	 System.out.println("retrieve student based on the id "+ tempStudent.getId());
			        	 
			        	 Student mystudent =session.get(Student.class,tempStudent.getId());
			        	 System.out.println("get complete: " + mystudent);
			        	 
			        	 //commit the transaction
			        	 session.getTransaction().commit();
			        	 System.out.println("Done ");
			         }
			         finally {
			        	 factory.close();
			         }
}}
