package com.luv2code.hibernate.demo;

import java.lang.module.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
	public static void main(String[] args) {
	//create session factory
    SessionFactory factory =new Configuration()
	 .configure("hibernate.cfg.xml");
    .addAnnotatedClass(Student.class);
    .buildSessionFactory();
    
//create session
    Session session =factory.getCurrentSession();
    
    try {
    	
    	int studentId=1;
    	
   	 
   	 //now get a new session and start transaction
   	 session =factory.getCurrentSession();
   	 session.beginTransaction();
   	 
   	 
   	 //retrieve student based on the id : primary key
   	 System.out.println("retrieve student with id "+ studentId);
   	 
   	 Student mystudent =session.get(Student.class,studentId);
   	 
   	 
   	 System.out.println("delete student: ");
   	session.delete(mystudent);
   	
   	/****************/
    System.out.println("delete student id 2 ");
    session.createQuery("delete from Student  where id =2")
    .executeUpdate();
   	
   	
   	 //commit the transaction
   	 session.getTransaction().commit();
   	 System.out.println("Done ");
   	 
	}
    finally {
   	 factory.close();
    }
}
}
