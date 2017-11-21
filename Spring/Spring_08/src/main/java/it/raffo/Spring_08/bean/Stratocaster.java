package it.raffo.Spring_08.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="stratocaster") 
public class Stratocaster implements Strumento {
	private String suono;
	
	public Stratocaster() {
		// TODO Auto-generated constructor stub
	}
	
	public Stratocaster(String suono) {
		super();
		this.suono = suono;
	}

	public String getSuono() {
		return suono;
	}

	@Value("${show.stratocaster.sound}")
	public void setSuono(String suono) {
		this.suono = suono;
	}


	@Override
	public String play() {
		// TODO Auto-generated method stub
		return suono;
	}

}
