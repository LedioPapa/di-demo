package guru.springframework.didemo;

import guru.springframework.didemo.exampleBeans.FakeDataSource;
import guru.springframework.didemo.exampleBeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
//        //run method returns the application context
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
//
//        //the context saves the beans with the same names of the class but starting with a lowercase letter
//        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource);

        FakeJmsBroker jmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(jmsBroker);
    }

}
