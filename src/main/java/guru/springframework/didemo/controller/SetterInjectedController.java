package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by ledio on 4/12/19
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
