package it.raffo.annotazioni;


public class Base {
	
	public void test1()
	{

	}

	@Deprecated
	public int somma(int a,int b)
	{
		return a+b;
	}
	
	public int somma(int[] elem)
	{
		int somma=0;
		for (int i : elem) {
			somma+=i;
		}
		return somma;
	}
}
