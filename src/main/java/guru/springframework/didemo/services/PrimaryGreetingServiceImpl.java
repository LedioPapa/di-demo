package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/13/19
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "Yo!!! from primary service";
    }
}
