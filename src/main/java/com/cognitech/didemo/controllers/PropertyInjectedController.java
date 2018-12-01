/*
 * Created by Amit on 25/11/2018
 */

package com.cognitech.didemo.controllers;

import com.cognitech.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController
{
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }
}
