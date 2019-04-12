package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by ledio on 4/12/19
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
