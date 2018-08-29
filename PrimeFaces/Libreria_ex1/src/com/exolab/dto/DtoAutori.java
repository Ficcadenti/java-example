package com.exolab.dto;

public class DtoAutori {

	private String	nome;
	private String	cognome;
	private String	nazionalita;

	public String getNazionalita() {
		return this.nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public int getEta() {
		return this.eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	private int	eta;
	private int	id;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
