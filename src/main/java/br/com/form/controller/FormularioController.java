package br.com.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormularioController {

	@GetMapping("/form")
	public String formulario() {
		return "formulario";
	}
}
