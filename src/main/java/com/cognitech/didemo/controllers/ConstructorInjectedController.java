/**
 * Created by User on 25/11/2018
 */

package com.cognitech.didemo.controllers;

import com.cognitech.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController
{
    private GreetingService greetingService;

    // Constructors-----------------------------------------------------------------------------------
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    // Methods-----------------------------------------------------------------------------------
    public String sayHello()
    {
        return this.greetingService.sayGreeting();
    }
}
