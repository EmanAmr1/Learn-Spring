package com.luv2code.hibernate.demo;

import java.lang.module.Configuration;
import java.util.List;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	public static void main(String[] args) {
	//create session factory
	         SessionFactory factory =new Configuration()
			 .configure("hibernate.cfg.xml");
	         .addAnnotatedClass(Student.class);
	         .buildSessionFactory();
	         
	//create session
	         Session session =factory.getCurrentSession();
	         
	         try {
	        	 //start a transaction
	        	 session.beginTransaction();
	        	 
	        	//query students
	        	 List<Student> theStudents =session.createQuery("from Student").list();
	        	 
	        	 //display the students
	        	 for(Student tempStudent :theStudents) {
	        		 System.out.println(tempStudent);	 
	        	 }
	        	 
	        	 
	        	//query students: lastName='AMR'
	        	 theStudents =session.createQuery("from Student s where s.lastName='AMR'").list();
	        	 
	        	//display the students: lastName='AMR'
	        	 System.out.println("students: lastName='AMR' ");
	        	 displayStudents(theStudents);
	        	 
	        	 
	        	 
	        	//query students: lastName='AMR' or firsrName='eman'
	        	 theStudents =session.createQuery("from Student s where "
	        	+" s.lastName='AMR' OR s.firstName='eman'").list();
	        	 
	            //display the students: lastName='AMR'or firsrName='eman'
	        	 System.out.println("students: lastName='AMR' or firsrName='eman' ");
	        	 displayStudents(theStudents);
	        	 
	        	 
	        	 
	        	//query students where email like %luv2code
	        	 theStudents =session.createQuery("from Student s where  s.email LIKE '%luv2code' ").list();
	        	 System.out.println("students where email like %luv2code ");   	
	        	 displayStudents(theStudents);
	        	 
	        	 //commit the transaction
	        	 session.getTransaction().commit();
	        	 
	     
	        	
	        	 System.out.println("Done ");
	         }
			private void displayStudents(List<Student> theStudents) {
				for(Student tempStudent :theStudents) {
	        		 System.out.println(tempStudent);	 
	        	 }
			}
	         finally {
	        	 factory.close();
	         }
}

}
