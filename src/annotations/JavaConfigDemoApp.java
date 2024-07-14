package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java ***class*** no xml 
		AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the container
		Play p =context.getBean("tennisPlaying",Play.class);
		
		//call a method in a bean
		System.out.println(p.getDailyPlaying());
		
		//close the context
        context.close();
		

	}

}
