package it.raffo.alberobinario;

public class Nodo
{
	private Scheda	sc;
	private Nodo	dx;
	private Nodo	sx;

	public Nodo()
	{
		this.sc = null;
		this.sx = null;
		this.dx = null;
	}

	public Nodo(Scheda sc)
	{
		this.sc = sc;
		this.sx = null;
		this.dx = null;
	}

	public Nodo(Scheda sc, Nodo sx, Nodo dx)
	{
		this.sc = sc;
		this.sx = sx;
		this.dx = dx;
	}

	public Nodo getDx()
	{
		return this.dx;
	}

	public Scheda getSc()
	{
		return this.sc;
	}

	public Nodo getSx()
	{
		return this.sx;
	}

	public void setDx(Nodo dx)
	{
		this.dx = dx;
	}

	public void setSc(Scheda sc)
	{
		this.sc = sc;
	}

	public void setSx(Nodo sx)
	{
		this.sx = sx;
	}

	@Override
	public String toString()
	{
		return "Nodo [sc=" + this.sc + ", dx=" + this.dx + ", sx=" + this.sx + "]";
	}

}
