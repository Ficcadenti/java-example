package it.raffo.collection;

public class macchina
{
	private String	modello;
	private Colore	colore;
	private int		codice;

	public macchina(String modello, Colore colore, int codice)
	{
		this.modello = modello;
		this.colore = colore;
		this.codice = codice;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		macchina other = (macchina) obj;
		if (this.modello == null)
		{
			if (other.modello != null)
			{
				return false;
			}
		}
		else if (!this.modello.equals(other.modello))
		{
			return false;
		}
		return true;
	}

	public int getCodice()
	{
		return this.codice;
	}

	public Colore getColore()
	{
		return this.colore;
	}

	public String getModello()
	{
		return this.modello;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.modello == null) ? 0 : this.modello.hashCode());
		return result;
	}

	public void setCodice(int codice)
	{
		this.codice = codice;
	}

	public void setColore(Colore colore)
	{
		this.colore = colore;
	}

	public void setModello(String modello)
	{
		this.modello = modello;
	}

}
