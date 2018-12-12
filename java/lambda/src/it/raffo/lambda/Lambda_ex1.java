package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lambda_ex1
{

	public static void main(String[] args)
	{
		List<String> lista = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 100; i++)
		{
			lista.add("STR(" + random.nextInt(100) + ")");
		}

		lista.stream().forEach(E -> System.out.println(E));

		List<String> elem = lista.stream().filter(E -> E.startsWith("STR(5")).collect(Collectors.toList());

		if (!elem.isEmpty())
		{
			elem.stream().forEach(E -> System.out.println("Trovato: " + E));
		}
		else
		{
			System.out.println("Nessun elemento.");
		}

	}

}
