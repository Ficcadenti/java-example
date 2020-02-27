package it.raffomafr.reflection;

public class Mattoncino
{
	private String	nome;
	private String	tipo;
	private String	img;
	private int		numero;

	public String getTipo()
	{
		return this.tipo;
	}

	public String getImg()
	{
		return this.img;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setTipo(String cognome)
	{
		this.tipo = cognome;
	}

	public void setImg(String email)
	{
		this.img = email;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getNumero()
	{
		return this.numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}
}
