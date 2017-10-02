package it.raffo.annotazioni;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapPollution {

	@SafeVarargs
	public static <T> void showParamInfo(T... array)
	{
		for(T element: array)
		{
			Class<? extends Object> c=  element.getClass();
			System.out.println(c.getName() + ":" + element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Heap pollution !!!!\n");
		int a=1;
		double b=2f;
		ArrayList<Integer> a_i=new ArrayList<>();
		a_i.add(1);
		
		ArrayList<Double> a_d=new ArrayList<>();
		a_d.add(3.6);
		
		Base b1=new Base();
		showParamInfo(a_i,a_d,a,b,"XYZ",500,b1);
	}

}
