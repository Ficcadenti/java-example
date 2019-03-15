package it.raffo.grafi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Grafo
{
	private HashMap<Object, Set<Arco>>	nodi;
	private int							numeroArchi;

	public Grafo()
	{
		this.nodi = new HashMap<Object, Set<Arco>>();
		this.numeroArchi = 0;
	}

	public boolean add(Arco a)
	{
		return this.add(a.getNodo1(), a.getNodo2(), a.getValore());
	}

	public boolean add(Nodo x, Nodo y, Integer value)
	{
		boolean flag = false, flag1 = false;
		if (!this.nodi.containsKey(x))
		{
			this.add(x);
		}
		if (!this.nodi.containsKey(y))
		{
			this.add(y);
		}
		Arco a = new Arco(x, y, value);
		flag = (this.nodi.get(x)).add(a);
		flag1 = (this.nodi.get(y)).add(a);
		flag = flag && flag1;
		if (flag)
		{
			this.numeroArchi++;
		}
		return flag;
	}

	public void add(Object x)
	{
		if (!this.nodi.containsKey(x))
		{
			Set<Arco> lista = new HashSet<Arco>();
			this.nodi.put(x, lista);
		}
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		Grafo other = (Grafo) obj;
		if (this.nodi == null)
		{
			if (other.nodi != null)
			{
				return false;
			}
		}
		else if (!this.nodi.equals(other.nodi))
		{
			return false;
		}
		if (this.numeroArchi != other.numeroArchi)
		{
			return false;
		}
		return true;
	}

	public Set<Object> getInsiemeNodi()
	{
		return this.nodi.keySet();
	}

	public Set<Arco> getInsiemiArchi()
	{
		Set<Arco> setArchi = new HashSet<Arco>();
		Iterator<Set<Arco>> hashSetI = this.nodi.values().iterator();
		while (hashSetI.hasNext())
		{
			setArchi.addAll(hashSetI.next());
		}

		return setArchi;
	}

	public Set<Arco> getInsiemiArchi(Object nodo)
	{
		if (this.nodi.containsKey(nodo))
		{
			return this.nodi.get(nodo);
		}
		else
		{
			return null;
		}
	}

	public HashMap<Object, Set<Arco>> getNodi()
	{
		return this.nodi;
	}

	public int getNumeroArchi()
	{
		return this.numeroArchi;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.nodi == null) ? 0 : this.nodi.hashCode());
		result = (prime * result) + this.numeroArchi;
		return result;
	}

	public int numeroNodi()
	{
		return this.nodi.size();
	}

	public boolean remove(Arco a)
	{
		boolean flag = false, flag1 = false;
		if (this.nodi.containsKey(a.getNodo1()) && this.nodi.containsKey(a.getNodo2()))
		{
			flag = ((HashSet<Arco>) this.nodi.get(a.getNodo1())).remove(a);
			flag1 = ((HashSet<Arco>) this.nodi.get(a.getNodo2())).remove(a);
		}
		return flag || flag1;
	}

	public boolean remove(Nodo x, Nodo y, Integer value)
	{
		Arco a = new Arco(x, y, value);
		return this.remove(a);
	}

	public void remove(Object x)
	{
		if (this.nodi.containsKey(x))
		{
			Iterator<Arco> arcoIncidenteI = ((HashSet<Arco>) this.nodi.get(x)).iterator();
			Arco a;
			Object y;
			while (arcoIncidenteI.hasNext())
			{
				a = arcoIncidenteI.next();
				y = (a.getNodo1().equals(x)) ? a.getNodo2() : a.getNodo1();
				if (((HashSet<Arco>) this.nodi.get(y)).remove(a))
				{
					this.numeroArchi--;
				}
			}
			this.nodi.remove(x);
		}
	}

	public void setNodi(HashMap<Object, Set<Arco>> nodi)
	{
		this.nodi = nodi;
	}

	public void setNumeroArchi(int numeroArchi)
	{
		this.numeroArchi = numeroArchi;
	}

	@Override
	public String toString()
	{
		StringBuffer out = new StringBuffer();
		Object nodo;
		Arco a;
		Iterator<Arco> arcoI;
		Iterator<Object> nodoI = this.nodi.keySet().iterator();
		while (nodoI.hasNext())
		{
			arcoI = this.nodi.get(nodo = nodoI.next()).iterator();
			out.append("Nodo " + nodo.toString() + ": ");
			while (arcoI.hasNext())
			{
				a = arcoI.next();
				// out.append( ((a.x == nodo ) ? a.y.toString() : a.x.toString()) +
				// "("+a.value.toString()+"), ");
				out.append(a.toString() + ", ");
			}
			out.append("\n");
		}
		return out.toString();
	}
}
