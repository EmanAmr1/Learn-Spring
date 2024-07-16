package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
				        	 
				        	 //create 3 student object 
				        	 System.out.println("creating new student obj ");
				        	 Student tempStudent1 = new Student("eman","amr","eman@gmail.com");
				        	 Student tempStudent2 = new Student("asmaa","amr","asmaaa@gmail.com");
				        	 Student tempStudent3 = new Student("aya","amr","aya@gmail.com");
				        	 //start a transaction
				        	 session.beginTransaction();
				        	 
				        	 //save the student object 
				        	 System.out.println("saving the student ");
				        	 session.save(tempStudent1);
				        	 session.save(tempStudent2);
				        	 session.save(tempStudent3);
				        	 //commit the transaction
				        	 session.getTransaction().commit();
				        	 System.out.println("Done ");
				         }
				         finally {
				        	 factory.close();
				         }

	}

}
