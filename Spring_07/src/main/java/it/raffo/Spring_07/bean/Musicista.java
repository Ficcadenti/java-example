package it.raffo.Spring_07.bean;

/* Un musicista (suona uno strumento). */
public class Musicista implements Artista{
	/* il nome del musicista */
	private String name;
	/* lo strumento suonato dal musicista */
	private Strumento instrument;
	
	public Musicista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Musicista(String name, Strumento instrument) {
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

	public void setInstrument(Strumento instrument) {
		this.instrument = instrument;
	}


	/* Esibizione del musicista. */
	public String perform() {
		return "I'm " + this.name + ": and play \"" + this.instrument.play()+"\"";
	}
}