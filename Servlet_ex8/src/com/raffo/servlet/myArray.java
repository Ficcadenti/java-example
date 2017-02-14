package com.raffo.servlet;

import java.util.Vector;

public class myArray
{
	Vector<String> vector = new Vector<String>();
	
	public String[] getItems() 
	{
		String[] items = new String[vector.size()];
		vector.toArray(items);
		return items;
	}
	
	public void setItems(String[] items)
	{
		vector.clear();
		for (int i = 0; i < items.length; i++)
			vector.addElement(items[i]);
	}
	
	public String getItems(int i) 
	{
		return (String)vector.elementAt(i);
	}
	
	public void setItems(int i, String item) 
	{
		vector.setElementAt(item, i);
	}
	
	public String getFormattedItems() 
	{
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < vector.size(); i++)
		{
			buffer.append(Integer.toString(i+1) + ". "	+ (String)vector.elementAt(i) + "<br>");
		}
		return buffer.toString();
	}
}