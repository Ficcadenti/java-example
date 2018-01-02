package it.raffo.jaxrs;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class ApplicationData {
	/**
	 * 
	 */
	private int cont;
	
	@Inject
	private SessionData sessData;
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("@PostConstruct - ApplicationData");
	}
	
	
	public ApplicationData() {
		System.out.println("ApplicationData");
	}


	public synchronized int incCounter()
	{
		cont=cont+1;
		System.out.println("CONT="+cont);
		return cont;
	}
	
	public String getInfo() {
		int appCounter=incCounter();
		int sessCounter=sessData.incCounter();
		String str="\nappcounter = "+appCounter+", sessCounter = "+sessCounter+"\n";
        return str;	
	}
}
