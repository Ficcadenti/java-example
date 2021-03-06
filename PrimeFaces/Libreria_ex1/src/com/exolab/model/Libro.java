package com.exolab.model;

public class Libro {

	private String titolo;
	private String serie;
	private String collana;
	private String lingua;
	private String genere;
	private int anno;
	private int pagine;
	private double prezzo;
	private long isbn;
	private int id_editore;
	private int id_autore;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getCollana() {
		return collana;
	}
	public void setCollana(String collana) {
		this.collana = collana;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getId_editore() {
		return id_editore;
	}
	public void setId_editore(int id_editore) {
		this.id_editore = id_editore;
	}
	public int getId_autore() {
		return id_autore;
	}
	public void setId_autore(int id_autore) {
		this.id_autore = id_autore;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", serie=" + serie + ", collana=" + collana + ", lingua=" + lingua
				+ ", genere=" + genere + ", anno=" + anno + ", pagine=" + pagine + ", prezzo=" + prezzo + ", isbn="
				+ isbn + "]";
	}
	
	
}
