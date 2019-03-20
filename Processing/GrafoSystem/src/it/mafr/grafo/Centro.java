package it.mafr.grafo;

public class Centro
{

	public int	x;
	public int	y;

	public Centro(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Centro [x=" + this.x + ", y=" + this.y + "]";
	}

}
