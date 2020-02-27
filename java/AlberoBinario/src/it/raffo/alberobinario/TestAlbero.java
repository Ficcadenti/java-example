package it.raffo.alberobinario;

public class TestAlbero
{
	private static final int	ITERATIVO	= 1;
	private static final int	RICORSIVO	= 2;

	public static void main(String[] args)
	{
		Scheda sc1 = new Scheda("Raffaele", "Ficcadenti", 42);
		Scheda sc2 = new Scheda("Edo", "Galizia", 50);
		Scheda sc3 = new Scheda("Yuri", "Quaglia", 31);
		Scheda sc4 = new Scheda("Samuele", "Parentato", 18);
		Scheda sc5 = new Scheda("Alberto", "Ruggeri", 28);
		Scheda sc6 = new Scheda("Francesca", "Maffia", 16);
		Scheda sc7 = new Scheda("Enzo", "Cianfarani", 70);
		Scheda sc8 = new Scheda("Pluto", "Pippo", 23);

		AlberoBinario albero = new AlberoBinario(RICORSIVO);
		albero.inserisciValore(sc1);
		albero.inserisciValore(sc2);
		albero.inserisciValore(sc3);
		albero.inserisciValore(sc4);
		albero.inserisciValore(sc5);
		albero.inserisciValore(sc6);
		albero.inserisciValore(sc7);
		albero.inserisciValore(sc8);

		// System.out.println("Cancello : " + sc4);
		// albero.cancella(sc3);

		System.out.println("In Order : ");
		// albero.visitaLivelli();
		albero.visitaInOrder();

		System.out.println("Dimensione  : " + albero.dimensione());
		System.out.println("Altezza min : " + albero.altezzaMinima());
		System.out.println("Altezza max : " + albero.altezzaMassima());
		System.out.println("Profondità  : " + albero.profondita(sc5));
		System.out.println("Profondità  : " + albero.profondita(sc1));
		System.out.println("Minimo      : " + albero.getMinimo());
		System.out.println("Massimo     : " + albero.getMassimo());
		System.out.println("Bilanciato  : " + albero.isBilanciato());

		// System.out.println("Nodo con altezza max : " +
		// albero.altezzaMassima2().getSc());

		// if (albero.cerca(sc5) != null)
		// {
		// System.out.println("Cerca : " + albero.cerca(sc5).getSc());
		// }
		//
		// Scheda s = sc3;
		// System.out.print("Successore (" + s.getEta() + ") : ");
		// Nodo successore = albero.successore(s);
		// if (successore != null)
		// {
		// System.out.println(successore.getSc());
		// }
		// else
		// {
		// System.out.println("NULL");
		// }
		//
		// s = sc3;
		// System.out.print("Predecessore (" + s.getEta() + ") : ");
		// Nodo predecessore = albero.predecessore(s);
		// if (predecessore != null)
		// {
		// System.out.println(predecessore.getSc());
		// }
		// else
		// {
		// System.out.println(": NULL");
		// }
	}

	public static void stampaPostOrdine(Nodo albero)
	{

	}

}
