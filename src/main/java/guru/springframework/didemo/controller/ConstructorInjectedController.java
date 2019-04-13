package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by ledio on 4/12/19
 */
@Controller
public class ConstructorInjectedController {

    //@Autowired //optional because the spring handles the dependency via the constructor
    //but it won't work if you use @Qualifier
    //so better to either @Autowire the constructor or not use @Autowire at all in this case
    private GreetingService greetingService;

    //this can also be annotated with @Autowired but is still optional, as mentioned above
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
