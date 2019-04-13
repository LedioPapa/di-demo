package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/13/19
 */
@Service
@Profile({"en", "default"}) //spring uses the default profile when no profile is selected
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "Yo!!! from primary service";
    }
}
