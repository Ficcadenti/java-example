package it;

public class test
{

	public static void main(String[] args)
	{
		try
		{
			String x = null;
			x.length();
		}
		catch (NullPointerException e)
		{
			System.out.println("A");
		}
		finally
		{
			System.out.println("B");
		}
		System.out.println("C");
	}

}
