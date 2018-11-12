package it.raffo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;

public class Collectio_ex1
{

	public static int nr;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Collection.");

		Set<String> e = new TreeSet<>();
		e.add("Roma");
		e.add("Lazio");
		stampaCollection(e);

		List<Integer> s1 = new ArrayList<>();
		s1.add(1);
		s1.add(2);
		stampaLista(s1);

		Map<String, Integer> m = new HashMap<>();
		m.put("Key1", 1);
		m.put("Key2", 2);

		m.forEach((k, v) ->
		{
			System.out.println(k + ":" + v);
		});

		Set<macchina> car = new HashSet<>();
		macchina c1 = new macchina("Fiat 500", Colore.BLU, 1);
		macchina c2 = new macchina("Ford Fusion", Colore.BIANCO, 3);
		macchina c3 = new macchina("Fiat Uno", Colore.GIALLO, 5);
		macchina c4 = new macchina("Ford KA", Colore.BIANCO, 4);
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);

		OptionalDouble media = car.stream().filter(c -> c.getColore() == Colore.BIANCO).mapToInt(c -> c.getCodice())
				.average();

		System.out.println(media);

		car.stream().forEach(c ->
		{

			if (c.getColore() == Colore.BIANCO)
			{
				nr++;
			}
		});

		System.out.println(nr);

		System.out.println("P1");
		car.parallelStream().map(c -> c.getModello()).forEach(modello -> System.out.println(modello));

		System.out.println("P2");
		car.parallelStream().map(c -> c.getModello()).forEachOrdered(modello -> System.out.println(modello));
	}

	public static void stampaCollection(Collection<String> c)
	{
		System.out.println("for--->");
		for (String entry : c)
		{
			System.out.println(entry);
		}
		System.out.println("Iterator--->");
		Iterator<String> it = c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void stampaLista(List<Integer> c)
	{
		for (Integer entry : c)
		{
			System.out.println(entry);
		}
	}
}
