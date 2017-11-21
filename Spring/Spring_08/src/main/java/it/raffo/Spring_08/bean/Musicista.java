package it.raffo.Spring_08.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* Un musicista (suona uno strumento). */
@Component(value="roger") 
public class Musicista implements Artista{
	/* il nome del musicista */
	private String name;
	/* lo strumento suonato dal musicista */
	private Fender instrument;
	
	public Musicista() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Musicista(@Value("${show.roger.name}")String name, Fender instrument) {
		super();
		this.name = name;
		this.instrument = instrument;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Strumento getInstrument() {
		return instrument;
	}

	public void setInstrument(Fender instrument) {
		this.instrument = instrument;
	}


	/* Esibizione del musicista. */
	public String perform() {
		return "I'm " + this.name + ": and play \"" + this.instrument.play()+"\"";
	}
}