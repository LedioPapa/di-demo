package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by ledio on 4/12/19
 */
@Controller
public class SetterInjectedController {

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

//    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
