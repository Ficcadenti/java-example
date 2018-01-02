package it.raffo.jaxrs;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessionData implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private int cont;
	
	
	public SessionData() {
		System.out.println("SessionData");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("@PostConstruct - SessionData");
	}

	public synchronized int incCounter()
	{
		cont=cont+1;
		System.out.println("CONT="+cont);
		return cont;
	}
}
