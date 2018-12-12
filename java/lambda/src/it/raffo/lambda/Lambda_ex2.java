package it.raffo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lambda_ex2
{
	public static void main(String[] args)
	{
		List<Nominativo> list = new ArrayList<>();

		Random random = new Random();
		for (int i = 0; i < 10; i++)
		{
			list.add(new Nominativo(i, "nome-" + random.nextInt(100)));
		}

		list.forEach(E -> System.out.println(E.getId() + ":" + E.getNome()));

		List<String> listNomi = list.stream().map(E -> E.getNome()).collect(Collectors.toList());
		System.out.println("****************");
		listNomi.forEach(E -> System.out.println(E));
	}
}
