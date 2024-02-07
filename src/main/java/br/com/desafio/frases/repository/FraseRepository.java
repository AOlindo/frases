package br.com.desafio.frases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.desafio.frases.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{

	@Query("select f from Frase f order by function('RANDOM') limit 1")
	Frase buscaFraseAleatoria();
}
