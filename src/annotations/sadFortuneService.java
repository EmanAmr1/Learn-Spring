package annotations;

import com.spring.demo.FortuneService;

public class sadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "inside sad Fortune Service";
	}

}
