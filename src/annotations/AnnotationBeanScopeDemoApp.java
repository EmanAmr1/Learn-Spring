package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file 
				ClassPathXmlApplicationContext context =new 
						ClassPathXmlApplicationContext("annotationsApplicationContext.xml");
				
				//get the bean from the container
				Play p1 =context.getBean("tennisPlaying",Play.class);
				
				Play p2 =context.getBean("tennisPlaying",Play.class);
				

				//check if they are the same 
				
				boolean result = (p1==p1);
				
				//print out the results
				System.out.println("\npointing to the same object ? " + result);
				
				System.out.println("\nMemory location for p1: " + p1);
				
				System.out.println("\nMemory location for p2: " + p2 + "\n");
				
				//close the context
		        context.close();

	}

}
