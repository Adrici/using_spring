package org.generation.blogPessoal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGeral {
	
	
	// abrir pagina login //método de redirecionamento (para tema, no caso)
	@GetMapping("/")
	public String login() {
		return "tema";
	}

}
