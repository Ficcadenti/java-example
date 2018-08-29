package it.raffo.jaxrs;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationData implements Serializable
{
	private static final long	serialVersionUID	= 6365843015407004813L;
	private int					cont;

	public ApplicationData()
	{
		System.out.println("ApplicationData");
	}

	public synchronized int incCounter()
	{
		this.cont = this.cont + 1;
		System.out.println("CONT=" + this.cont);
		return this.cont;
	}

	@PostConstruct
	public void init()
	{
		System.out.println("@PostConstruct - ApplicationData");
	}

}
