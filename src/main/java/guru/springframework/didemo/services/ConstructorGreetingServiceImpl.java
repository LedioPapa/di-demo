package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/13/19
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "Yo!!! The constructor implementation";
    }
}
