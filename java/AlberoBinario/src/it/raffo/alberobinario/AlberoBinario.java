package it.raffo.alberobinario;

import java.util.LinkedList;
import java.util.Queue;

public class AlberoBinario
{
	private static final int	ITERATIVO	= 1;
	private static final int	RICORSIVO	= 2;
	private static final int	FOGLIA		= 0;
	private static final int	UN_FIGLIO	= 1;
	private static final int	DUE_FIGLI	= 2;

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

	public int altezzaMassima()
	{
		if (this.root == null)
		{
			return 0;
		}
		else
		{
			return this.altezzaMassima(this.root);

		}
	}

	private int altezzaMassima(Nodo nodoCorrente)
	{
		if (nodoCorrente == null)
		{
			return 0;
		}
		else
		{
			return this.max(this.altezzaMassima(nodoCorrente.getSx()), this.altezzaMassima(nodoCorrente.getDx())) + 1;
		}
	}

	public Nodo altezzaMassima2()
	{
		return this.altezzaMassima2(this.root);
	}

	private Nodo altezzaMassima2(Nodo nodoCorrente)
	{
		Nodo max = nodoCorrente;
		if (nodoCorrente != null)
		{
			Queue<Nodo> coda = new LinkedList<Nodo>();
			coda.add(nodoCorrente);

			while (!coda.isEmpty())
			{
				Nodo temp = coda.poll();

				if (this.profondita(temp.getSc()) > this.profondita(max.getSc()))
				{
					max = temp;
				}

				if (temp != null)
				{
					this.visita(temp);
					if (temp.getSx() != null)
					{
						coda.add(temp.getSx());
					}
					if (temp.getDx() != null)
					{
						coda.add(temp.getDx());
					}
				}
			}

		}

		return max;

	}

	public int altezzaMinima()
	{
		if (this.root == null)
		{
			return 0;
		}
		else
		{
			return this.altezzaMinima(this.root);

		}
	}

	private int altezzaMinima(Nodo nodoCorrente)
	{
		if (nodoCorrente == null)
		{
			return 0;
		}
		else
		{
			return this.min(this.altezzaMinima(nodoCorrente.getSx()), this.altezzaMinima(nodoCorrente.getDx())) + 1;
		}
	}

	private void cancella(Nodo nodoCorrente)
	{
		if (this.grado(nodoCorrente) == FOGLIA)
		{
			Nodo padre = nodoCorrente.getPadre();
			if ((padre.getDx() != null) && padre.getDx().getSc().equals(nodoCorrente.getSc()))
			{
				padre.setDx(null);
			}
			else
			{
				padre.setSx(null);
			}
		}
		else if (this.grado(nodoCorrente) == UN_FIGLIO)
		{
			Nodo successivo = null;
			if (nodoCorrente.getSx() != null)
			{
				successivo = nodoCorrente.getSx();
			}
			else
			{
				successivo = nodoCorrente.getDx();
			}

			Nodo padre = nodoCorrente.getPadre();
			if (padre.getDx().getSc().equals(nodoCorrente.getSc()))
			{
				padre.setDx(successivo);
			}
			else
			{
				padre.setSx(successivo);
			}

			successivo.setPadre(padre);
		}
		else if (this.grado(nodoCorrente) == DUE_FIGLI)
		{
			Nodo successore = this.successore(nodoCorrente);
			nodoCorrente.setSc(successore.getSc());
			System.out.println("2 figli e cancello il successore : " + successore.getSc());
			System.out.println("con grado=" + this.grado(successore));
			this.cancella(successore);
		}

	}

	public void cancella(Scheda sc)
	{
		Nodo nodoCorrente = this.cerca(sc);
		if (nodoCorrente == null)
		{
			return;
		}
		this.cancella(nodoCorrente);
	}

	public Nodo cerca(Scheda sc)
	{
		if (this.root == null)
		{
			return null;
		}
		return this.cercaNodo(sc, this.root);

	}

	private Nodo cercaNodo(Scheda sc, Nodo nodoCorrente)
	{
		if (nodoCorrente == null)
		{
			return null;
		}
		else if (nodoCorrente.getSc().compareTo(sc) > 0)
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

	public int dimensione()
	{
		if (this.root == null)
		{
			return 0;
		}
		else
		{
			return this.dimensione(this.root);

		}
	}

	private int dimensione(Nodo nodoCorrente)
	{
		if (nodoCorrente == null)
		{
			return 0;
		}
		else
		{
			return this.dimensione(nodoCorrente.getSx()) + this.dimensione(nodoCorrente.getDx()) + 1;
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

	private int grado(Nodo n)
	{
		int g = 0;
		if (n.getDx() != null)
		{
			g++;
		}
		if (n.getSx() != null)
		{
			g++;
		}
		return g;
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
		Nodo figlio = new Nodo(valore);
		figlio.setPadre(nodoCorrente);

		if (valore.compareTo(nodoCorrente.getSc()) < 0)
		{
			if (nodoCorrente.getSx() == null)
			{
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

	public boolean isBilanciato()
	{
		if (this.root == null)
		{
			return false;
		}
		else
		{
			return this.isBilanciato(this.root);
		}
	}

	public boolean isBilanciato(Nodo nodoCorrente)
	{
		return ((this.altezzaMassima(nodoCorrente) - this.altezzaMinima(nodoCorrente)) <= 1);
	}

	private boolean isFoglia(Nodo n)
	{
		return (n.getSx() == null) && (n.getDx() == null);
	}

	public boolean isMax(Nodo nodoCorrente)
	{
		if (nodoCorrente != null)
		{
			return nodoCorrente.getSc().equals(this.getMassimo(nodoCorrente).getSc());
		}
		else
		{
			return false;
		}
	}

	private int max(int a, int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	private int min(int a, int b)
	{
		if (a <= b)
		{
			return a;
		}
		else
		{
			return b;
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

	private Nodo predecessore(Nodo nodoCorrente)
	{
		if (nodoCorrente.getSx() != null)
		{
			return this.getMassimo(nodoCorrente.getSx());
		}
		else
		{
			Nodo padre = nodoCorrente.getPadre();
			while ((padre != null) && (padre.getSx() != null) && nodoCorrente.getSc().equals(padre.getSx().getSc()))
			{
				nodoCorrente = padre;
				padre = nodoCorrente.getPadre();
			}
			return padre;
		}
	}

	public Nodo predecessore(Scheda sc)
	{
		Nodo nodoCorrente = this.cerca(sc);
		if (nodoCorrente == null)
		{
			return null;
		}
		return this.predecessore(nodoCorrente);
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

	public int profondita(Scheda sc)
	{
		int p = 0;
		Nodo nodoCorrente = this.cerca(sc);
		if (nodoCorrente == null)
		{
			p = -1;
		}
		else
		{
			while (nodoCorrente.getPadre() != null)
			{
				p++;
				nodoCorrente = nodoCorrente.getPadre();
			}
		}
		return p;
	}

	public void setModo(int modo)
	{
		this.modo = modo;
	}

	public void setRoot(Nodo root)
	{
		this.root = root;
	}

	private Nodo successore(Nodo nodoCorrente)
	{
		if (nodoCorrente.getDx() != null)
		{
			return this.getMinimo(nodoCorrente.getDx());
		}
		else
		{
			Nodo padre = nodoCorrente.getPadre();
			while ((padre != null) && (padre.getDx() != null) && nodoCorrente.getSc().equals(padre.getDx().getSc()))
			{
				nodoCorrente = padre;
				padre = nodoCorrente.getPadre();
			}
			return padre;
		}
	}

	public Nodo successore(Scheda sc)
	{
		Nodo nodoCorrente = this.cerca(sc);
		if (nodoCorrente == null)
		{
			return null;
		}
		return this.successore(nodoCorrente);
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

	public void visitaLivelli()
	{

		this.visitaLivelli(this.root);
	}

	private void visitaLivelli(Nodo nodoCorrente)
	{

		if (nodoCorrente != null)
		{
			Queue<Nodo> coda = new LinkedList<Nodo>();
			coda.add(nodoCorrente);
			while (!coda.isEmpty())
			{
				Nodo temp = coda.poll();
				if (temp != null)
				{
					this.visita(temp);
					if (temp.getSx() != null)
					{
						coda.add(temp.getSx());
					}
					if (temp.getDx() != null)
					{
						coda.add(temp.getDx());
					}
				}
			}
		}
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
