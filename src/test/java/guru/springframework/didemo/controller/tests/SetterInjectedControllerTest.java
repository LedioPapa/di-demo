package guru.springframework.didemo.controller.tests;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ledio on 4/12/19
 */
public class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals("Yoo!!!", setterInjectedController.getGreetingService().hello());
    }
}
