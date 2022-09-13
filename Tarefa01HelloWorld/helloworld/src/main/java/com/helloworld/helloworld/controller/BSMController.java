package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {

	@GetMapping
	public String bsms() {
		
		return "As BSM da Generation são: "
				+ "\nMentalidades:"
				+ "\n- Orientação ao Futuro"
				+ "\n- Responsabilidade Pessoal"
				+ "\n- Mentalidade de Crescimento"
				+ "\n- Persistência\r\n"
				+ "\nHabilidades:"
				+ "\n- Trabalho em Equipe"
				+ "\n- Atenção aos Detalhes"
				+ "\n- Proatividade"
				+ "\n- Comunicação";
	}

}
