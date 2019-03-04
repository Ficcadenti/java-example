package it.raffo.alberobinario;

public class AlberoBinario
{
	private static final int	ITERATIVO	= 1;
	private static final int	RICORSIVO	= 2;

	private Nodo				root;
	private int					modo;

	public AlberoBinario()
	{
		super();
		this.root = null;
		this.setModo(RICORSIVO);
	}

	public AlberoBinario(int modo)
	{
		super();
		this.root = null;
		this.setModo(modo);
	}

	public Nodo cerca(Scheda sc)
	{
		if (this.root == null)
		{
			return null;
		}
		return this.cercaNodo(sc, this.root);

	}

	public Nodo cercaAntenato(Scheda sc)
	{
		if (this.root == null)
		{
			return null;
		}

		return this.root;

	}

	private Nodo cercaNodo(Scheda sc, Nodo nodoCorrente)
	{
		if (nodoCorrente.getSc().compareTo(sc) > 0)
		{
			return this.cercaNodo(sc, nodoCorrente.getSx());
		}
		else if (nodoCorrente.getSc().compareTo(sc) < 0)
		{
			return this.cercaNodo(sc, nodoCorrente.getDx());
		}
		else
		{
			return nodoCorrente;
		}
	}

	public Scheda getMassimo()
	{
		if (this.root == null)
		{
			return null;
		}
		else
		{
			return this.getMassimo(this.root).getSc();
		}
	}

	private Nodo getMassimo(Nodo nodo)
	{
		if (nodo.getDx() != null)
		{
			return this.getMassimo(nodo.getDx());
		}
		else
		{
			return nodo;
		}
	}

	public Scheda getMinimo()
	{
		if (this.root == null)
		{
			return null;
		}
		else
		{
			return this.getMinimo(this.root).getSc();
		}
	}

	private Nodo getMinimo(Nodo nodo)
	{
		if (nodo.getSx() != null)
		{
			return this.getMinimo(nodo.getSx());
		}
		else
		{
			return nodo;
		}
	}

	public int getModo()
	{
		return this.modo;
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
			if (this.getModo() == ITERATIVO)
			{
				this.insertI(this.root, valore);
			}
			else if (this.getModo() == RICORSIVO)
			{
				this.insert(this.root, valore);
			}
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
				Nodo figlio = new Nodo(valore);
				figlio.setPadre(nodoCorrente);
				nodoCorrente.setSx(figlio);

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
				Nodo figlio = new Nodo(valore);
				figlio.setPadre(nodoCorrente);
				nodoCorrente.setDx(figlio);
			}
			else
			{
				this.insert(nodoCorrente.getDx(), valore);
			}
		}
	}

	private void insertI(Nodo nodoCorrente, Scheda valore)
	{
		Nodo attuale = null;
		while (nodoCorrente != null)
		{
			System.out.println(nodoCorrente);
			if (valore.compareTo(nodoCorrente.getSc()) < 0)
			{
				if (nodoCorrente.getSx() == null)
				{
					nodoCorrente.setSx(new Nodo(valore));
				}
				else
				{
					nodoCorrente = nodoCorrente.getSx();
				}
			}
			else
			{
				if (valore.compareTo(nodoCorrente.getSc()) > 0)
				{
					if (nodoCorrente.getDx() == null)
					{
						nodoCorrente.setDx(new Nodo(valore));
					}
					else
					{
						nodoCorrente = nodoCorrente.getDx();
					}
				}
				else
				{
					return;
				}
			}
		}
		nodoCorrente = new Nodo(valore);
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

	public void setModo(int modo)
	{
		this.modo = modo;
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
		System.out.println("Nome    : " + nodo.getSc().getNome());
		System.out.println("Cognome : " + nodo.getSc().getCognome());
		System.out.println("Età     : " + nodo.getSc().getEta());
		if (nodo.getPadre() != null)
		{
			System.out.println("Padre   : " + nodo.getPadre().getSc().getCognome() + " ("
					+ nodo.getPadre().getSc().getEta() + ")");
		}
		System.out.println("\n");
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
