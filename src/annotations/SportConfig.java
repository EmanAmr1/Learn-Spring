package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Coach;
import com.spring.demo.FortuneService;

@Configuration
//@ComponentScan("annotations") //commented to use the two beans that manually defined
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for sadFortune service
	//note the method name is the bean id
	@Bean
	public FortuneService sadFortuneService() {
			return new sadFortuneService();
	} 
	
	//define a bean for swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //sadFortuneService() is the bean id
	}
}
