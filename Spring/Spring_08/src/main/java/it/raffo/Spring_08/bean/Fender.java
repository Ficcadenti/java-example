package it.raffo.Spring_08.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="fender") 
public class Fender implements Strumento {
	private String suono;
	
	public Fender() {
		// TODO Auto-generated constructor stub
	}
	
	public Fender(String suono) {
		super();
		this.suono = suono;
	}

	public String getSuono() {
		return suono;
	}

	@Value("${show.fender.sound}")
	public void setSuono(String suono) {
		this.suono = suono;
	}


	@Override
	public String play() {
		// TODO Auto-generated method stub
		return suono;
	}

}
