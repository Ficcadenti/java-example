package it.raffo.lambda;

public class Nominativo
{
	private int		id;
	private String	nome;

	public Nominativo(int id, String nome)
	{
		this.setId(id);
		this.setNome(nome);
	}

	public int getId()
	{
		return this.id;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
