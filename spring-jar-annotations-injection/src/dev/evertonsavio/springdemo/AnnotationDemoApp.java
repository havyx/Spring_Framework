package dev.evertonsavio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//ler a spring config file  
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Adquirir o bean do container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//chamar o metodo do bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Fechar o context
		context.close();
	}

}