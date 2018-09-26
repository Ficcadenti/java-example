package it.raffo.singleton;

public class test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Singleton.getInstance().helloWorld();
		Singleton.getInstance().setA(10);

		int x[] = new int[] { 4, 8, 12 };

		System.out.println(x[0]);
		System.out.println(Singleton.getInstance().getA());

	}

}
