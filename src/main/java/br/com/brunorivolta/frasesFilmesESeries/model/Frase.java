package br.com.brunorivolta.frasesFilmesESeries.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titulo;
	String personagem;
	@Column(unique = true)
	String frase;
	String poster;

	public Frase() {
	}

	public Frase(Long id, String titulo, String personagem, String frase, String poster) {
		this.id = id;
		this.titulo = titulo;
		this.personagem = personagem;
		this.frase = frase;
		this.poster = poster;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
}
