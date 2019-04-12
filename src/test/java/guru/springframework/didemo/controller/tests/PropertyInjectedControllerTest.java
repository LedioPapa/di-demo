package guru.springframework.didemo.controller.tests;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ledio on 4/12/19
 */
public class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals("Yoo!!!", propertyInjectedController.greetingService.hello());
    }
}
