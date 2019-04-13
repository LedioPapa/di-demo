package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
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

        System.out.println(controller.hello());

        //you can also use the class as a parameter of getBean to get the instantiation of your class
        System.out.println(ctx.getBean(PropertyInjectedController.class).greetingService.hello());
        System.out.println(ctx.getBean(SetterInjectedController.class).getGreetingService().hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreetingService().hello());
    }

}
