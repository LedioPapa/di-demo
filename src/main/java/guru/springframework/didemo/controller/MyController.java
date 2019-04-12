package guru.springframework.didemo.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by ledio on 4/12/19
 */
@Controller //this also makes the class a bean, apart from making it a controller,
// so it is registered with the application context
public class MyController {

    public String hello() {
        System.out.println("Yoo!!");
        return "";
    }
}
