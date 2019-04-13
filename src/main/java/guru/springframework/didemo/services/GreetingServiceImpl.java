package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/12/19
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String hello() {
        return "Yoo!!!";
    }
}
