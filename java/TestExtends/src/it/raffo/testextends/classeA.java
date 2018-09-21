package it.raffo.testextends;

public class classeA extends classeBase
{
	private int	aa;
	private int	bb;

	public int getAa()
	{
		return this.aa;
	}

	public int getBb()
	{
		return this.bb;
	}

	public void setAa(int aa)
	{
		this.aa = aa;
	}

	public void setBb(int bb)
	{
		this.bb = bb;
	}

	public int sommaQuadrati()
	{
		System.out.println("sommaQuadrati(" + this.getA() + "," + this.getB() + ")");

		this.setA(this.getAa() * this.getAa());
		this.setB(this.getBb() * this.getBb());
		System.out.println("classeA.this.aa=" + this.getAa());
		System.out.println("classeA.this.bb=" + this.getBb());
		System.out.println("classeA.super.a=" + super.getA());
		System.out.println("classeA.super.b=" + super.getB());

		return this.somma();

	}
}
