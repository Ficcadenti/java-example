package com.raffo.test;

import java.io.Serializable;
import java.util.EventObject;

public class myEvent extends EventObject implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3460327039900761394L;
	
	public myEvent(Object source) 
	{
		super(source);
	
	}
	
}
