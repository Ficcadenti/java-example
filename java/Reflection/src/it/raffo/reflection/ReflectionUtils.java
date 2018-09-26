package it.raffo.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtils
{

	public static String getClassName(Object aClass)
	{
		return aClass.getClass().getSimpleName();
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

		// Nome Classe
		System.out.println("Nome classe: " + getClassName(u));

		// Proprieta classe
		Arrays.stream(getStringFields(u)).sorted().forEach(e -> System.out.println(e));

		// Metodi classe
		Arrays.stream(getStringMethods(u)).sorted().forEach(e -> System.out.println(e));

	}

}
