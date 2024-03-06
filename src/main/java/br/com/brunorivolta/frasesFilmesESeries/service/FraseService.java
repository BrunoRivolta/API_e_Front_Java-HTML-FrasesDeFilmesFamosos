package br.com.brunorivolta.frasesFilmesESeries.service;

import br.com.brunorivolta.frasesFilmesESeries.dto.FraseDTO;
import br.com.brunorivolta.frasesFilmesESeries.model.Frase;
import br.com.brunorivolta.frasesFilmesESeries.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
	@Autowired
	private FraseRepository repositorio;

	public List<FraseDTO> obterTodasAsFrases() {
		return converterDTO(repositorio.findAll());
	}

	public FraseDTO obterFraseAleatoria() {
		var lista = converterDTO(repositorio.fraseAleatoria());
		return lista.get(0);
	}

	static List<FraseDTO> converterDTO(List<Frase> lista) {
		return lista.stream()
			.map(f -> new FraseDTO(f.getId(), f.getTitulo(), f.getPersonagem(), f.getFrase(), f.getPoster()))
			.collect(Collectors.toList());
	}
}
