package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/13/19
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "Hallo von dem Dienst, der die deutsche Sprache implementiert";
    }
}
