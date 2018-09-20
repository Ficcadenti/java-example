package it.raffo.astrazione;

public class client
{

	public static void main(String[] args)
	{
		MyProcess p = new MyProcess();
		ValeProcess v = new ValeProcess();
		p.process();
		v.process();
	}

}
