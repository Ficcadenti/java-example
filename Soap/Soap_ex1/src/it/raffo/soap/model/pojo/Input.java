package it.raffo.soap.model.pojo;

public class Input
{

	private int[] vector;

	public Input()
	{
	}

	public Input(int... numbers)
	{
		this.vector = numbers;
	}

	public int[] getVector()
	{
		return this.vector;
	}

	public void setVector(int[] vector)
	{
		this.vector = vector;
	}

}