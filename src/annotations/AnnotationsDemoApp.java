package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Coach;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		// read spring config file 
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("annotationsApplicationContext.xml");
		
		//get the bean from the container
		Play p =context.getBean("tennisPlaying",Play.class);
		
		//call a method in a bean
		System.out.println(p.getDailyPlaying());
		
		//close the context
        context.close();
		
	}

}
