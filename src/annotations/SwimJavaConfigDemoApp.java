package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.Coach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java ***class*** no xml 
		AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the container
		Coach theCoach =context.getBean("swimCoach",Coach.class); //the bean that i declare in SwimConfig.java
		
		//call a method in a bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		//close the context
        context.close();
		

	}

}
