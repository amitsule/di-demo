/*
 * Created by User on 01/12/2018
 */

package com.cognitech.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Servicio de Saludo Primario";
    }
}
