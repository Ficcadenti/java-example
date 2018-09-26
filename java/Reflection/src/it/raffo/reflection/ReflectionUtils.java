package it.raffo.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtils
{

	private static String checkCase(String name)
	{
		String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
		return cap;
	}

	public static String getClassName(Object aClass)
	{
		return aClass.getClass().getSimpleName();
	}

	public static String getProperty(String name, Object target)
	{
		String ritorno = new String();
		Method metodo = null;
		String nameToUpperCase = checkCase(name);

		try
		{
			metodo = target.getClass().getMethod("get" + nameToUpperCase, null);
		}
		catch (NoSuchMethodException exc)
		{
		}

		if (metodo != null)
		{
			try
			{
				ritorno = (String) metodo.invoke(target, new Object[0]);
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
		Utente u = new Utente();
		u.setNome("Raffaele");
		u.setCognome("Fiffacenti");
		u.setEmail("raffaele.ficcadenti@gmail.com");

		// Nome Classe
		System.out.println("Nome classe: " + getClassName(u));

		// Proprieta classe
		Arrays.stream(getStringFields(u)).sorted().forEach(e -> System.out.println(e));

		// Metodi classe
		Arrays.stream(getStringMethods(u)).sorted().forEach(e -> System.out.println(e));

		System.out.println("Nome : " + getProperty("nome", u));
		System.out.println("Nome : " + getProperty("cognome", u));
		System.out.println("Nome : " + getProperty("email", u));

	}

}
