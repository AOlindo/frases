package br.com.desafio.frases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.frases.dto.FraseDto;
import br.com.desafio.frases.service.FraseService;

@RestController
@RequestMapping
public class FraseController {

	@Autowired
	private FraseService frasesService;
	
	@GetMapping("/series/frases")
	public FraseDto obterFraseAleatoria() {
		return frasesService.obterFraseAleatoria();
	}
}
