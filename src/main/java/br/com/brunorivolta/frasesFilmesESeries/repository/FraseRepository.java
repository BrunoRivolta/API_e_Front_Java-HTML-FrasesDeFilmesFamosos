package br.com.brunorivolta.frasesFilmesESeries.repository;

import br.com.brunorivolta.frasesFilmesESeries.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository  extends JpaRepository<Frase, Long>{
	@Query("select f from Frase f ORDER BY RANDOM() LIMIT 1")
	List<Frase> fraseAleatoria();
}
