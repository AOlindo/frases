package br.com.desafio.frases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.frases.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{

}
