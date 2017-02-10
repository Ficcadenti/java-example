package com.raffo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test_serializzazione
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esempio di serializzazione");
		Record r=new Record(10,20);
		r.stampa();
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try 
		{
			fos = new FileOutputStream("data.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(r);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r.reset();
		
		try 
		{
			FileInputStream fis = new FileInputStream("data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			r = (Record)ois.readObject();
			ois.close();
			r.stampa();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
