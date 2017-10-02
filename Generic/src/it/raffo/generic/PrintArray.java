package it.raffo.generic;

public class PrintArray {

	public PrintArray() {
		// TODO Auto-generated constructor stub
	}

	public void  printArray(Integer array[])
	{
		for(Integer i: array)
		{
			System.out.printf("%d\n",i);
		}
	}
	
	public void  printArray(Double array[])
	{
		for(Double d: array)
		{
			System.out.printf("%f\n",d);
		}
	}
	
	public void  printArray(String array[])
	{
		for(String s: array)
		{
			System.out.printf("%s\n",s);
		}
	}
	
	public void  printArray(Character array[])
	{
		for(Character c: array)
		{
			System.out.printf("%s\n",c);
		}
	}

}
