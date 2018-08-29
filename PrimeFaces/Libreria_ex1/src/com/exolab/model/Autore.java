package com.exolab.model;

public class Autore {

	private int		annoDiNascita;
	private String	nome;
	private String	cognome;
	private String	nazionalita;

	public int getAnnoDiNascita() {
		return this.annoDiNascita;
	}

	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public String getNazionalita() {
		return this.nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Autore [annoDiNascita=" + this.annoDiNascita + ", nome=" + this.nome + ", cognome=" + this.cognome + ", nazionalita =" + this.nazionalita + "]";
	}

}
