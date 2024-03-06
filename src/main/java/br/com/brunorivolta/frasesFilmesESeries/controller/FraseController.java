package br.com.brunorivolta.frasesFilmesESeries.controller;

import br.com.brunorivolta.frasesFilmesESeries.dto.FraseDTO;
import br.com.brunorivolta.frasesFilmesESeries.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/series/frases")
public class FraseController {
	@Autowired
	private FraseService servico;

	@GetMapping
	public FraseDTO obtertFraseAleatoria() {
		return servico.obterFraseAleatoria();
	}
	@GetMapping("/todas")
	public List<FraseDTO> obertFrases() {
		return servico.obterTodasAsFrases();
	}
}


