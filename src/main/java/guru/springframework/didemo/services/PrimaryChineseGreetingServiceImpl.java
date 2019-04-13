package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ledio on 4/13/19
 */
@Service
@Profile("chinese")
@Primary
public class PrimaryChineseGreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "NIHAO...ZAIJIAN";
    }
}
