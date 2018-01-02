package it.raffo.jaxrs;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;


public class Libro implements Serializable {

	   
	private Long id;
	private String autore;
	private String titolo;
	private static final long serialVersionUID = 1L;

	public Libro() {
		super();
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getAutore() {
		return this.autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}   
	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
   
}
