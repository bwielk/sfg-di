package dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from greeting service implementation";
    }
}
