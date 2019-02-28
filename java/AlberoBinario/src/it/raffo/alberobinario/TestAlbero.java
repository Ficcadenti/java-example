package it.raffo.alberobinario;

public class TestAlbero
{
	public static void main(String[] args)
	{
		Scheda sc1 = new Scheda("Raffaele", "Ficcadenti");
		Scheda sc3 = new Scheda("Yuri", "Quaglia");
		Scheda sc2 = new Scheda("Edo", "Galizia");
		Scheda sc4 = new Scheda("Samuele", "Parentato");
		Scheda sc5 = new Scheda("Alberto", "Ruggeri");
		Scheda sc6 = new Scheda("Enzo", "Cianfarani");

		AlberoBinario albero = new AlberoBinario();
		albero.inserisciValore(sc1);
		albero.inserisciValore(sc2);
		albero.inserisciValore(sc3);
		albero.inserisciValore(sc4);
		albero.inserisciValore(sc5);
		albero.inserisciValore(sc6);

		System.out.println("Pre Order:");
		albero.visitaPreOrder();

		System.out.println("Post Order:");
		albero.visitaPostOrder();

		System.out.println("In Order:");
		albero.visitaInOrder();
	}

	public static void stampaPostOrdine(Nodo albero)
	{

	}

}
