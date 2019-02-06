package it.raffo.soap.model.pojo;

public class Output
{

	private int[] sortedVector;

	public Output()
	{
	}

	public Output(int... numbers)
	{
		this.sortedVector = numbers;
	}

	public int[] getSortedVector()
	{
		return this.sortedVector;
	}

	public void setSortedVector(int[] sortedVector)
	{
		this.sortedVector = sortedVector;
	}

}