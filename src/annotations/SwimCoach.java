package annotations;

import com.spring.demo.Coach;
import com.spring.demo.FortuneService;

public class SwimCoach implements Coach {
	
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

}
