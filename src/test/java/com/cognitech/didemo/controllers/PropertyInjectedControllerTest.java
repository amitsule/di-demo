/**
 * Created by User on 25/11/2018
 */
package com.cognitech.didemo.controllers;

import com.cognitech.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest
{
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup()
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void ensureTestGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_TEXT, propertyInjectedController.sayHello());
    }
}
