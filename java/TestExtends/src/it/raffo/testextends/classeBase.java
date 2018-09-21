package it.raffo.testextends;

public class classeBase
{
	private int	a;
	private int	b;

	protected int getA()
	{
		return this.a;
	}

	protected int getB()
	{
		return this.b;
	}

	protected void setA(int a)
	{
		this.a = a;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public int somma()
	{
		return this.getA() + this.getB();
	}
}
