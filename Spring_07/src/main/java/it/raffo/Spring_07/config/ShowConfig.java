package it.raffo.Spring_07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.raffo.Spring_07.bean.Artista;
import it.raffo.Spring_07.bean.Chitarra;
import it.raffo.Spring_07.bean.Musicista;
import it.raffo.Spring_07.bean.Strumento;

@Configuration
public class ShowConfig {
	@Bean
	public Artista hendrix() {
		return new Musicista("Jimi Hendrix", stratocaster());
	}
	@Bean
	public Strumento stratocaster() {
		Chitarra stratocaster = new Chitarra();
		stratocaster.setSuono("All Along the Watchtower");
		return stratocaster;
	}
	
	@Bean
	public Artista roger() {
		return new Musicista("Roger Waters", contrabasso());
	}
	@Bean
	public Strumento contrabasso() {
		Chitarra contrabasso = new Chitarra();
		contrabasso.setSuono("Us and Them");
		return contrabasso;
	}

}
