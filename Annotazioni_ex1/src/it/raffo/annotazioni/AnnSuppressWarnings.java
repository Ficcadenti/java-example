package it.raffo.annotazioni;

import java.util.ArrayList;

public class AnnSuppressWarnings {

	@SuppressWarnings("unchecked")
	public static void addElement()
	{
		ArrayList l = new ArrayList();
		l.add("...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Annotazioni - Suppress Warning !!!!\n");
		addElement();

	}

}
