package annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisPlaying implements Play {

	@Override
	public String getDailyPlaying() {
		return "playing tennis";
	}



}
