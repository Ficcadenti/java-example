package it.raffo.Spring_07.bean;

public class Chitarra implements Strumento {
	private String suono;
	
	public Chitarra() {
		// TODO Auto-generated constructor stub
	}
	
	public Chitarra(String suono) {
		super();
		this.suono = suono;
	}

	public String getSuono() {
		return suono;
	}

	public void setSuono(String suono) {
		this.suono = suono;
	}


	@Override
	public String play() {
		// TODO Auto-generated method stub
		return suono;
	}

}
