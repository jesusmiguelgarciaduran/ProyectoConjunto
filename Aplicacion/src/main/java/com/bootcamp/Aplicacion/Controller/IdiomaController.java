package com.bootcamp.Aplicacion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.Config.IdiomaProperties;

@RestController
public class IdiomaController {

	@Autowired IdiomaProperties s;
	
	@GetMapping("/Idioma")
	public String getIdioma() {
		
		return s.getsLenguaje();
	}
	
	@GetMapping("/")
	public String getSaludo() {
		return "hola";
	}
}
