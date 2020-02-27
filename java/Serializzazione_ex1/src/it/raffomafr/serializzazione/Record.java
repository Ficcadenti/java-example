package it.raffomafr.serializzazione;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class Record implements Serializable
{

	private static final long	serialVersionUID	= -462940430687681995L;
	int							primo;
	int							perfetto;
	transient int				primiGemelli;

	private static final Logger	log					= Logger.getLogger(Record.class);

	public Record(int a, int b, int c)
	{
		this.primo = a;
		this.perfetto = b;
		this.primiGemelli = c;
	}

	public void reset()
	{
		this.primo = this.perfetto = this.primiGemelli = 0;
	}

	public void stampa()
	{
		log.info("Primo          = " + this.primo);
		log.info("Perfetto       = " + this.perfetto);
		log.info("Primi gemelli  = " + this.primiGemelli);
	}
}
