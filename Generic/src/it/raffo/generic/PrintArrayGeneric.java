package it.raffo.generic;

public class PrintArrayGeneric {

	public PrintArrayGeneric() {
		// TODO Auto-generated constructor stub
	}
	

	public <E>void  printArray( E array[] )
	{
		System.out.print("[");
		for(E elem: array)
		{
			System.out.print(elem+" ");
		}
		System.out.println("]");
	}

}
