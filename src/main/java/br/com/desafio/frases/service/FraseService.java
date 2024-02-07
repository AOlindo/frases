package br.com.desafio.frases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.frases.dto.FraseDto;
import br.com.desafio.frases.model.Frase;
import br.com.desafio.frases.repository.FraseRepository;

@Service
public class FraseService {
	
	@Autowired
	private FraseRepository fraseRepository;

	public FraseDto obterFraseAleatoria() {
		Frase frase = fraseRepository.buscaFraseAleatoria();
		return new FraseDto(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
	}
	
}
