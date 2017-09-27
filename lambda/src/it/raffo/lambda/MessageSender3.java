package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;

public class MessageSender3 {
	List<Persona> iscritti;

	public List<Persona> getIscritti() {
		return iscritti;
	}

	public void setIscritti(List<Persona> iscritti) {
		this.iscritti = iscritti;
	}
	
	public List<Persona> getIscrittiFiltratiPer(ITest<Persona> aTest){
	      List<Persona> persone = new ArrayList<Persona>();
	      for (Persona p:iscritti)
	          if (aTest.test(p))
	              persone.add(p);
	 
	      return persone;
	    }
	 
	    public void sendMessage(String msg, List<Persona> persone){
	       // Logica di Invio messaggio
	       // .........
	 
	       System.out.println("Inviato messaggio a "+persone.size()+" iscritti");
	     }
}
