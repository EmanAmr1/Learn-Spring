package DBRelationships;

public class DeleteInstructorDetailDemo {
	public static void main(String[] args) {
		//create session factory
		SessionFactory factory =new Configuration()
				.configure("hibernate.cfg.xml");
		         .addAnnotatedClass(Instractor.class);
		         .addAnnotatedClass(InstractorDetail.class);
		         .buildSessionFactory();
		         
		//create session
		         Session session =factory.getCurrentSession();
		         
		         try {
		  
		        	 
		        	 //start a transaction
		        	 session.beginTransaction();
		        	
		        	 //get the instructor detail object 
		        	 int theId =1;
		        	 InstructorDetail tempInstructorDetail =session.get(InstructorDetail.class ,theId );
		        	
		        	 
		        	//print the instructor detail
		        	 System.out.println("Found InstructorDetail: "+ tempInstructor );
		        	 
		        	 //print the associated instructor
		        	 System.out.println("the associated instructor "+tempInstructorDetail.getInstructor());
		        	 
		        	 
		        	 //delete the instructor detail
		        	 System.out.println("delete the instructor detail "+tempInstructorDetail);
		        	 session.delete(tempInstructorDetail);
		        	 
		        	 //commit the transaction
		        	 session.getTransaction().commit();
		        	 System.out.println("Done ");
		         }
		         catch(Exception exc)
		         {
		        	 exc.printStackTrace();
		         }
		         finally {
		        	 session.close();
		         
		        	 factory.close();
		         }
	
	
	
}
}
