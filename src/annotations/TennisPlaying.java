package annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisPlaying implements Play {

	@Override
	public String getDailyPlaying() {
		return "playing tennis";
	}



}
