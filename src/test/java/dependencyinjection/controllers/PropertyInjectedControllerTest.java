package dependencyinjection.controllers;

import dependencyinjection.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getController() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}