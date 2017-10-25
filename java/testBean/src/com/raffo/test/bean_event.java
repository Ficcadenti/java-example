package com.raffo.test;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

public class bean_event implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3364381712178641508L;
	private Vector<myEventListener> myEventListeners = new Vector<myEventListener>();
	
	private String str="";
	
	public String getStr()
	{
		return str;
	}

	public void setStr(String s)
	{
		str=s;
		firemyEvent(new myEvent(this));
	}


	public void addmyEventListener(myEventListener t) {
		myEventListeners.add(t);
	}
	public void removemyEventListener(myEventListener t) {
		myEventListeners.remove(t);
	}
	
	protected void firemyEvent(myEvent e) 
	{
		Enumeration<myEventListener> listeners = myEventListeners.elements();
		while(listeners.hasMoreElements())
		((myEventListener)listeners.nextElement()).myEventPerformed(e);
	}

}
