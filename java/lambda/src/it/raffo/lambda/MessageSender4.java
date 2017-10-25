package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MessageSender4 {
	List<Persona> iscritti;

	public List<Persona> getIscritti() {
		return iscritti;
	}

	public void setIscritti(List<Persona> iscritti) {
		this.iscritti = iscritti;
	}

	public List<Persona> getIscrittiFiltratiPer(Predicate<Persona> pred){
		List<Persona> persone = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (pred.test(p))
				persone.add(p);

		return persone;
	}

	public void sendMessage(String msg, List<Persona> persone){
		// Logica di Invio messaggio
		// .........

		System.out.println("Inviato messaggio ("+msg+") a "+persone.size()+" iscritti");
	}

}
