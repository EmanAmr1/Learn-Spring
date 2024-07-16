package com.luv2code.hibernate.demo;

import java.lang.module.Configuration;
import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
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
   	 
   	 
   	 System.out.println("updated student: ";
   	mystudent.setFirstName("uj");
   			
   	 //commit the transaction
   	 session.getTransaction().commit();
   	 System.out.println("Done ");
   	 
   	 
   	 
   	 /*******************/
   	session=factory.getCurrentSession();
   	 session.getTransaction();
   	 
   	 //update email for all students
   	 System.out.println("update email for all students ");
   	 session.updateQury("update student set email= 'code@gmail.com'")
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
