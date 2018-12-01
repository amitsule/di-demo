/**
 * Created by User on 25/11/2018
 */

package com.cognitech.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello -- I was injected by constructor";
    }
}
