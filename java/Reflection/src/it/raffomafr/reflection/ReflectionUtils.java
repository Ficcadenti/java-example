package it.raffomafr.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtils
{

	private static String checkCase(String name) // per creare il nome del metodo con la prima lettera minuscila
	{
		String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
		return cap;
	}

	public static String getClassName(Object aClass) // prende il nome della classe senza il .class
	{
		return aClass.getClass().getSimpleName();
	}

	public static String getProperty(String name, Object target) // invoca i metodi della classe
	{
		String ritorno = new String();
		Method metodo = null;
		String nameToUpperCase = checkCase(name);

		try
		{
			System.out.println("Chiamo il metodo: " + ("get" + nameToUpperCase) + "()");
			metodo = target.getClass().getMethod("get" + nameToUpperCase, null);
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}

		if (metodo != null)
		{
			try
			{
				ritorno = "" + metodo.invoke(target);
			}
			catch (Exception ecc)
			{
			}
		}

		return ritorno;
	}

	public static String[] getStringFields(Object aClass)
	{
		Field[] campi = aClass.getClass().getDeclaredFields();
		String[] campiStringa = new String[campi.length];

		for (int i = 0; i < campi.length; i++)
		{
			campiStringa[i] = campi[i].getName();
		}
		return campiStringa;
	}

	public static String[] getStringMethods(Object aClass)
	{
		Method[] metodi = aClass.getClass().getDeclaredMethods();
		String[] campiStringa = new String[metodi.length];

		for (int i = 0; i < metodi.length; i++)
		{
			campiStringa[i] = metodi[i].getName();
		}
		return campiStringa;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Mattoncino mattoncino = new Mattoncino();
		mattoncino.setNome("MattoncinoT");
		mattoncino.setTipo("Un bel mattoncino");
		mattoncino.setNumero(6); // a caso :)
		mattoncino.setImg("mattoncinoT.jpg");

		// Nome Classe
		System.out.println("Nome classe: " + getClassName(mattoncino));

		// Proprieta classe
		Arrays.stream(getStringFields(mattoncino)).sorted().forEach(p -> System.out.println("Proprietà :" + p));

		// Metodi classe
		Arrays.stream(getStringMethods(mattoncino)).sorted().forEach(m -> System.out.println("Metodi :" + m));

		// invoco i metodi con una lambdina :)
		System.out.println("\n LAMBDINA");
		Arrays.stream(getStringFields(mattoncino)).sorted().forEach(p -> System.out.println(getProperty(p, mattoncino)));

		// invoco i metodi senza lambdina :)
		System.out.println("\n SENZA LAMBDINA");
		System.out.println("Nome     : " + getProperty("nome", mattoncino));
		System.out.println("Tipo     : " + getProperty("tipo", mattoncino));
		System.out.println("Immagine : " + getProperty("img", mattoncino));
		System.out.println("Numero   : " + getProperty("numero", mattoncino));

	}

}
