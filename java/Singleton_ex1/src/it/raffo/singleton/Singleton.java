package it.raffo.singleton;

public class Singleton
{
	private static Singleton istanza;

	public static Singleton getInstance()
	{
		if (istanza == null)
		{
			istanza = new Singleton();
		}

		return istanza;
	}

	int a;

	private Singleton()
	{
		// TODO Auto-generated constructor stub
	}

	public int getA()
	{
		return this.a;
	}

	public void helloWorld()
	{
		System.out.println("Hello World");
	}

	public void setA(int a)
	{
		this.a = a;
	}

}
