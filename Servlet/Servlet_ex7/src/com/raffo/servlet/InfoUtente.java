package com.raffo.servlet;

public class InfoUtente 
{
	private String nome = null;
	private String email = null;
	private int pagineViste;

	public InfoUtente()
	{
		pagineViste=0; 
	}

	public void aggiornaPV() 
	{ 
		pagineViste++; 
	}

	public int getPagineViste()
	{
		return pagineViste;
	}

	public void setNome(String value)
	{
		nome = value;
	}

	public String getNome()
	{
		return nome;
	}

	public void setEmail(String value)
	{
		email = value;
	}

	public String getEmail()
	{
		return email;
	}

	public String riassunto()
	{
		String riassunto = null;
		riassunto = "Il nome dell'utente è"+nome+","; 
		riassunto+= "il suo indirizzo e-mail è: "+email;
		riassunto+= " e ha visitato "+pagineViste+" del sito";
		return riassunto;
	}

}//InfoUtente 