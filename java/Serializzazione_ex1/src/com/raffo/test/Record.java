package com.raffo.test;

import java.io.Serializable;

public class Record implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -462940430687681995L;
	int a;
	transient int b;
	
	public Record(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void reset()
	{
		a=b=0;
	}
	
	public void stampa()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
