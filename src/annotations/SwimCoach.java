package annotations;

import org.springframework.beans.factory.annotation.Value;

import com.spring.demo.Coach;
import com.spring.demo.FortuneService;

public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	
	private FortuneService fortuneService;
	
	//constructor
	public SwimCoach(FortuneService TheFortuneService) {
		fortuneService=TheFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	
	

}
