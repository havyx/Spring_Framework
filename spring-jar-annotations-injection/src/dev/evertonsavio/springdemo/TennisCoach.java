package dev.evertonsavio.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //("thatSillyCoach") //been ID thatSillyCoach
public class TennisCoach implements Coach {
	
	@Autowired //Aplica direto no field atraves de Java Reflection, mto bom!
	@Qualifier("randomFortuneService") //Porque temos varias implementacoes para a FortuneService
	private FortuneService fortuneService;
	
	private TennisCoach() {
		//Construcor with no parameter
	};
	
	/*@Autowired
	private TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Pratique sua sacada!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
