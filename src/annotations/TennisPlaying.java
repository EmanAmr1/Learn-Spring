package annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisPlaying implements Play {

	@Override
	public String getDailyPlaying() {
		return "playing tennis";
	}


	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("class TennisPlaying-doMyStartupStuff ");
	}
	
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("class TennisPlaying-doMyCleanupStuff ");
	}
}
