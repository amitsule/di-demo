/**
 * Created by User on 25/11/2018
 */

package com.cognitech.didemo.controllers;

import com.cognitech.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest
{
    private SetterInjectedController controller;

    // Methods-----------------------------------------------------------------------------------
    @Before
    public void setup()
    {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    //-----------------------------------------------------------------------------------
    @Test
    public void ensureTestGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_TEXT, this.controller.sayHello());

    }
}
