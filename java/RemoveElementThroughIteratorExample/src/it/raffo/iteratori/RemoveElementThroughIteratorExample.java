package it.raffo.iteratori;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementThroughIteratorExample
{

	public static void main(String[] args)
	{

		// create an ArrayList object
		List<String> aList = new ArrayList<String>();

		// populate ArrayList object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		System.out.println("ArrayList before removal : ");
		for (int i = 0; i < aList.size(); i++)
		{
			System.out.println(aList.get(i));
		}

		// get an Iterator
		Iterator<String> itr = aList.iterator();

		// remove 2 from ArrayList using Iterator's remove method.
		String strElement = "";
		while (itr.hasNext())
		{

			/*
			 * Iterator's next method returns an Object so we need to cast it into
			 * appropriate class before using it.
			 */
			strElement = itr.next();

			if (strElement.equals("2"))
			{
				/*
				 * Remove an element using remove() method of Iterator Remove method removes an
				 * element from underlying collection and it may throw a
				 * UnsupportedOperationException if the remove operation is not supported.
				 */
				itr.remove();
				break;
			}

		}

		System.out.println("ArrayList after removal : ");
		for (int i = 0; i < aList.size(); i++)
		{
			System.out.println(aList.get(i));
		}

	}
}