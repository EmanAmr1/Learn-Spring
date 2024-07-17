package DBRelationships.OneToOne;

import com.luv2code.hibernate.demo.Configuration;
import com.luv2code.hibernate.demo.Session;
import com.luv2code.hibernate.demo.SessionFactory;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {
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
		        	 //create the objects
		        	 Instractor tempInstractor = new Instractor("gmal","omar","gmail@gmail.com");
		        	 InstractorDetail tempInstractorDetail = new InstractorDetail("youtube.com","coding");
		        	 
		        	 
		        	 //associate the objects
		        	 tempInstractor.setInstractorDetail(tempInstractorDetail);
		        	 
		        	 //start a transaction
		        	 session.beginTransaction();
		        	 
		        	//save the instructor
		        	 session.save(tempInstractor);
		        	 //commit the transaction
		        	 session.getTransaction().commit();
		        	 System.out.println("Done ");
		         }
		         finally {
		        	 factory.close();
		         }
	}
}
