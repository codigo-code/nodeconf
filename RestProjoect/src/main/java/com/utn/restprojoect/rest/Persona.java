package com.utn.restprojoect.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.restprojoect.modelo.PersonaModel;

@RestController
public class Persona {

	@GetMapping(value="/getPersona")
	public String devuelvoPerosna() {
		
		Gson g = new Gson();
		PersonaModel p = new PersonaModel();
		
		p.setNombre("dante");
		p.setApellido("panella");
		return g.toJson(p);
		
	}
}
