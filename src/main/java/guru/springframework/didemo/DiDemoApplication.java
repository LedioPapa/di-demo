package guru.springframework.didemo;

import guru.springframework.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        //run method returns the application context
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        //the context saves the beans with the same names of the class but starting with a lowercase letter
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
    }

}
