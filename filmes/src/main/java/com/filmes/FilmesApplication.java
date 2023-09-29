package com.filmes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}

	@Bean
	CommandLineRunner criarFilmes(FilmeRepository rp) {
		return args -> {
			rp.deleteAll();

			Filme patrulhaCanina = new Filme("Patrulha Canina", "Filme da Patrulha Canina é muito legal para assistir comendo" +
					" pipoca com a família", 100);

			Filme barbie = new Filme("Barbie", "Filme para assistir com todo mundo", 120);

			Filme velozesEFuriosos = new Filme("Velozes e Furiosos", "É um filme de carro muito legal de alta velocidade", 300);

			Filme pequenosEspioes = new Filme("Pequenos espiões 4", "Filme de espionagem espiônica com crianças", 150);

			Filme kungFuPanda = new Filme("Kung Fu Panda", "Filme de kung fu que tem um panda", 100);

			Filme carrosselDois = new Filme("Carrossel 2: o sumiço da Maria Joaquina", "Maria sumiço e carrossel", 80);

			Filme shrek = new Filme("Shrek", "Filme de muita diversão", 100);

			rp.save(patrulhaCanina);
			rp.save(barbie);
			rp.save(velozesEFuriosos);
			rp.save(pequenosEspioes);
			rp.save(kungFuPanda);
			rp.save(carrosselDois);
			rp.save(shrek);

		};
	}
}
