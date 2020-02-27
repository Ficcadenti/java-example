package it.raffomafr.serializzazione;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test
{
	private static final Logger log = Logger.getLogger(Test.class);

	public static void main(String[] args)
	{
		PropertyConfigurator.configure("log4j.properties");

		log.info("Esempio di serializzazione");

		Record r = new Record(3, 6, 10);
		log.info("Prima di salvare su file... :)");
		r.stampa();

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream("data.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(r);
		}
		catch (IOException e)
		{
			log.error(e.getMessage(), e);
		}

		r.reset();

		try
		{
			FileInputStream fis = new FileInputStream("data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			r = (Record) ois.readObject();
			ois.close();
			log.info("Letto da file... :)");
			r.stampa();
		}
		catch (IOException | ClassNotFoundException e)
		{
			log.error(e.getMessage(), e);
		}

	}

}
