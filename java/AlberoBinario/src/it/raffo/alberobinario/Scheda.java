package it.raffo.alberobinario;

public class Scheda implements Comparable<Scheda>
{
	private String	nome;
	private String	cognome;

	public Scheda(String n, String c)
	{
		this.nome = n;
		this.cognome = c;
	}

	@Override
	public int compareTo(Scheda o)
	{
		int ret = this.getCognome().compareToIgnoreCase(o.getCognome());
		return ret;
	}

	public String getCognome()
	{
		return this.cognome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return "Scheda [nome=" + this.nome + ", cognome=" + this.cognome + "]";
	}

}
