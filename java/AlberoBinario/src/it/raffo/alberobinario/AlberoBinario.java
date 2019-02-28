package it.raffo.alberobinario;

public class AlberoBinario
{
	private Nodo root;

	public AlberoBinario()
	{
		super();
		this.root = null;
	}

	public Nodo getRoot()
	{
		return this.root;
	}

	private void inOrder(Nodo nodo)
	{
		if (nodo != null)
		{
			this.inOrder(nodo.getSx());
			this.visita(nodo);
			this.inOrder(nodo.getDx());
		}
	}

	public void inserisciValore(Scheda valore)
	{
		if (this.root != null)
		{
			this.insert(this.root, valore);
		}
		else
		{
			this.root = new Nodo(valore);
		}

	}

	private void insert(Nodo nodoCorrente, Scheda valore)
	{
		if (valore.compareTo(nodoCorrente.getSc()) < 0)
		{
			if (nodoCorrente.getSx() == null)
			{
				nodoCorrente.setSx(new Nodo(valore));
			}
			else
			{
				this.insert(nodoCorrente.getSx(), valore);
			}
		}
		else
		{
			if (nodoCorrente.getDx() == null)
			{
				nodoCorrente.setDx(new Nodo(valore));
			}
			else
			{
				this.insert(nodoCorrente.getDx(), valore);
			}
		}
	}

	private void postOrder(Nodo nodo)
	{
		if (nodo != null)
		{
			this.postOrder(nodo.getSx());
			this.postOrder(nodo.getDx());
			this.visita(nodo);
		}
	}

	private void preOrder(Nodo nodo)
	{
		if (nodo != null)
		{
			this.visita(nodo);
			this.preOrder(nodo.getSx());
			this.preOrder(nodo.getDx());
		}
	}

	public void setRoot(Nodo root)
	{
		this.root = root;
	}

	@Override
	public String toString()
	{
		return "AlberoBinario [root=" + this.root + "]";
	}

	private void visita(Nodo nodo)
	{
		System.out.println("Nome: " + nodo.getSc().getNome());
		System.out.println("Nome: " + nodo.getSc().getCognome());
	}

	public void visitaInOrder()
	{
		this.inOrder(this.root);
	}

	public void visitaPostOrder()
	{
		this.postOrder(this.root);
	}

	public void visitaPreOrder()
	{
		this.preOrder(this.root);
	}

}
