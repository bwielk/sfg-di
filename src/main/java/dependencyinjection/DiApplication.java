package dependencyinjection;

import dependencyinjection.controllers.*;
import dependencyinjection.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		System.out.println("-------------------------------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(	i18nController.getGreeting());
		System.out.println("-------------------------------------");
		PrimaryGreetingService primaryGreetingService =
				(PrimaryGreetingService) ctx.getBean("primaryGreetingService");
		System.out.println(primaryGreetingService.sayGreeting());
		System.out.println("-------------------------------------");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("-------------------------------------");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("-------------------------------------");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
