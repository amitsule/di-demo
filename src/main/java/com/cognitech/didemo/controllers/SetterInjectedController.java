/**
 * Created by User on 25/11/2018
 */

package com.cognitech.didemo.controllers;

import com.cognitech.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController
{
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingServiceImpl)
    {
        this.greetingService = greetingServiceImpl;
    }

    //-----------------------------------------------------------------------------------
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
