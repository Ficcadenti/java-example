package it.raffo.generic;

public class MaxGeneric {

	public MaxGeneric() {
		// TODO Auto-generated constructor stub
	}
	
	public <T extends Comparable<T>> T maximum(T a,T b,T c)
	{
		T max = a;
		if(b.compareTo(max) > 0)
			max=b;
		if(c.compareTo(max) > 0)
			max=c;
		
		return max;
	}

}
