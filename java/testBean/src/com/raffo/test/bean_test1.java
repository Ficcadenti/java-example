package com.raffo.test;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;



public class bean_test1 extends Canvas
{
	private static final long serialVersionUID = 1L;
	
	
	//proprieta bound
	private String myString="Hello";
	
	//proprieta semplice
	private Color background=Color.red;
	private Color foreground=Color.blue;
	
	//proprieta indicizzata
	int myArray [] = {1, 2, 3, 4, 5, 6};
	
	

	public void setMyString(String newString)
	{
		String oldString = myString;
		myString = newString;
		firePropertyChange("newString", oldString,newString);
	}

	public String getMyString()
	{
		return myString;
	}

	public void setBackground(Color c)
	{
		background=c;
		super.setBackground(background);
	}

	public Color getBackground(Color c)
	{
		return background;
	}

	public void setForeground(Color c)
	{
		foreground=c;
		super.setForeground(foreground);
	}

	public Color getForeground(Color c)
	{
		return foreground;
	}

	public int getMyArray(int i)
	{
		return myArray[i];
	}

	public void setMyArray(int i, int x)
	{
		myArray[i] = x;
	}

	public int[] getMyArray()
	{
		return myArray;
	}

	public void setMyArray(int [] newArray)
	{
		myArray = newArray;
	}

	public Dimension getMinimumSize()
	{
		return new Dimension(50,50);
	}

	public void paint (Graphics g) {
		Graphics2D g2;
		g2 = (Graphics2D) g;
		g2.drawString (myString, 70, 70);
	}
}

