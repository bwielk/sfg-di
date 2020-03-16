package dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("DE")
public class I18nGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Ich bin Deutsch!";
    }
}
