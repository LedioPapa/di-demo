package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by ledio on 4/12/19
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

}
