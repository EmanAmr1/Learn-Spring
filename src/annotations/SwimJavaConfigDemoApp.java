package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.Coach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java ***class*** no xml 
		AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the container
		SwimCoach theCoach =context.getBean("swimCoach",SwimCoach.class); //the bean that i declare in SwimConfig.java
		
		//call a method in a bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//get email and team values - has the props values injected
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		//close the context
        context.close();
		

	}

}
