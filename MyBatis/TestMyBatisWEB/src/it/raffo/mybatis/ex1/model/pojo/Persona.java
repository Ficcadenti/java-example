package it.raffo.mybatis.ex1.model.pojo;

public class Persona {
	private int		id;
	private String	nome;
	private String	cognome;
	private String	telefono;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [" + this.getId() + ": " + this.getNome() + "; " + this.getCognome() + "; " + this.getTelefono() + "]";
	}
}
