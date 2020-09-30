package com.exemplo.gets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/gets")
 
public class Controller {
	
	@GetMapping("/get1")
	public String gets1() {  
		
		return "Mentalidades e Habilidades: esta tarefa exigiu persistência e atenção aos detalhes!"; 
		
	}
	
	@GetMapping("/get2")
	public String gets2() {  
		
		return "Objetivos de aprendizadem desta semana: evoluir tecnicamente em Spring Boot."; 
		
	}
  
}
