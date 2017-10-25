package it.raffo.generic.client;

import it.raffo.generic.Base;
import it.raffo.generic.Derivata;
import it.raffo.generic.MaxGeneric;
import it.raffo.generic.PrintArray;
import it.raffo.generic.PrintArrayGeneric;

public class Generic_ex1 {

	public Generic_ex1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Generic - Esempio 01-Overloading !!!!\n");
		PrintArray pa=new PrintArray();
		
		Double d[]= {1.3,1.5,5.0};
		Integer i[] = {1,2,3,4,5};
		Character c[]= {'a','b'};
		String s[]= {"Raffaele","Valeria"};
		
		pa.printArray(d);
		pa.printArray(i);
		pa.printArray(c);
		pa.printArray(s);
		
		System.out.printf("Generic - Esempio 02-Generic!!!\n");
		PrintArrayGeneric pag=new PrintArrayGeneric();
		pag.printArray(d);
		pag.printArray(i);
		pag.printArray(c);
		pag.printArray(s);
		
		System.out.printf("Generic - Esempio 03-Calcola il massimo di tre numeri!!!\n");
		MaxGeneric m=new MaxGeneric();
		int max=m.maximum(10, 20, 45);
		System.out.printf("Max=%d\n",max);
		
		System.out.printf("Generic - Esempio 04-!!\n");
		Base<Integer> b=new Base<Integer>(10);
		Integer val1=b.getElement();
		
		Derivata der=new Derivata("Ciao Raffaele");
		String val2=der.getElement();	
		
		

	}

}
