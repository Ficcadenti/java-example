package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;

public class MessageSender1 {

	List<Persona> iscritti;

	public List<Persona> getGiovaniDonne(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30)
				persone.add(p);

		return persone;
	}

	public List<Persona> getMaschi(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (p.getSesso().equals("M"))
				persone.add(p);

		return persone;
	}

	public List<Persona> getIscritti() {
		return iscritti;
	}

	public void setIscritti(List<Persona> iscritti) {
		this.iscritti = iscritti;
	}

	public List<Persona> getStranieri(){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (!p.getNazionalita().equals("italiana"))
				persone.add(p);

		return persone;
	}

	public void sendMessage(String msg, List<Persona> persone){
		// Logica di Invio messaggio
		// .........

		System.out.println("Inviato messaggio a "+persone.size()+" iscritti");
	}

}
