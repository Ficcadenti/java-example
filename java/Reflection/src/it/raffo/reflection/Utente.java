package it.raffo.reflection;

public class Utente
{
	private String	nome;
	private String	cognome;
	private String	email;

	public String getCognome()
	{
		return this.cognome;
	}

	public String getEmail()
	{
		return this.email;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
