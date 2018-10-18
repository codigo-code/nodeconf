package com.utn.restprojoect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//tiene que tener obligatoriamente esta anotacion para funcionar
@SpringBootApplication
public class App 
{
	// punto de inicio de la aplicacion
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
