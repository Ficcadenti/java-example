package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;

public class MessageSender2 {

	List<Persona> iscritti;

	public List<Persona> getIscritti() {
		return iscritti;
	}

	public void setIscritti(List<Persona> iscritti) {
		this.iscritti = iscritti;
	}

	public List<Persona> getGiovaniDonne(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (isGiovaneDonna(p))
				persone.add(p);

		return persone;
	}

	public List<Persona> getMaschi(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (isMaschio(p))
				persone.add(p);

		return persone;
	}

	public List<Persona> getStranieri(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (isStraniero(p))
				persone.add(p);

		return persone;
	}

	public boolean isGiovaneDonna(Persona p){
		return p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30;  
	} 

	public boolean isMaschio(Persona p){
		return p.getSesso().equals("M");  
	} 

	public boolean isStraniero(Persona p){
		return !p.getNazionalita().equals("italiana");  
	} 
	
	public void sendMessage(String msg, List<Persona> persone){
		// Logica di Invio messaggio
		// .........

		System.out.println("Inviato messaggio a "+persone.size()+" iscritti");
	}
}
