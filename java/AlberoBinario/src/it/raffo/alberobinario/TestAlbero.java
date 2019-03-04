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
		Scheda sc6 = new Scheda("Enzo", "Cianfarani", 70);

		AlberoBinario albero = new AlberoBinario(RICORSIVO);
		albero.inserisciValore(sc1);
		albero.inserisciValore(sc2);
		albero.inserisciValore(sc3);
		albero.inserisciValore(sc4);
		albero.inserisciValore(sc5);
		albero.inserisciValore(sc6);

		System.out.println("In Order:");
		albero.visitaInOrder();

		System.out.println("Minimo: " + albero.getMinimo());
		System.out.println("Massimo: " + albero.getMassimo());
		System.out.println("Cerca: " + albero.cerca(sc3).getSc());
	}

	public static void stampaPostOrdine(Nodo albero)
	{

	}

}
