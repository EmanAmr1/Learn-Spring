package DBRelationships;

public class DeleteDemo {
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
		        	 
		        	 
		        	//get instructor by primary key / id 
		        	 int theId =1;
		        	 Instructor tempInstructor =session.get(Instructor.class ,theId );
		        	 System.out.println("Found instructor: "+ tempInstructor );
		        	 //delete the instructors
		        	 
		        	 if(tempInstructor != null) {
		        		 System.out.println("deleting instructor: "+ tempInstructor );
		        		 //will also delete the instructorDetail
		        		 session.delete();
		        	 }
		        
		        	 //commit the transaction
		        	 session.getTransaction().commit();
		        	 System.out.println("Done ");
		         }
		         finally {
		        	 factory.close();
		         }
}
