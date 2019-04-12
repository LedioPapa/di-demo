package guru.springframework.didemo.controller.tests;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ledio on 4/12/19
 */
public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals("Yoo!!!", constructorInjectedController.getGreetingService().hello());
    }
}
