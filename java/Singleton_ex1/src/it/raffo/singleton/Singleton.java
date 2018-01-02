package it.raffo.singleton;

public class Singleton {

	private static Singleton istanza;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance()
	{
		if (istanza == null)
		{
			istanza = new Singleton();
		}

		return istanza; 
	}

	public void helloWorld()
	{
		System.out.println("Hello World");
	} 


}
