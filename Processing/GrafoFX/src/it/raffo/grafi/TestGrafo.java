package it.raffo.grafi;

import processing.core.PApplet;

public class TestGrafo extends PApplet
{
	public static int	distanzaMinima	= 20;
	public static int	h				= 1000;
	public static int	raggio			= 30;
	public static int	w				= 1000;

	public static void main(String[] args)
	{
		PApplet.main("it.raffo.grafi.TestGrafo");
	}

	@Override
	public void draw()
	{
	}

	public void generaPunti(int i)
	{
		for (int x = 0; x < i; x++)
		{
			this.stroke(255);
			this.strokeWeight(this.random(0, 2));
			this.point(this.random(0, w), this.random(0, h));
		}
	}

	@Override
	public void settings()
	{
		this.size(w, h);
	}

	@Override
	public void setup()
	{
		this.background(0);
		this.generaPunti(200);

		System.out.println("Test Grafo - 15-03/2019 - Raffo - raffaele.ficcadenti@gmail.com");

		Grafo g = new Grafo(this);
		g.setRaggio(raggio);
		Matrice.getInstance().setW(w);
		Matrice.getInstance().setH(h);
		Matrice.getInstance().setRaggio(raggio);
		Matrice.getInstance().setDistanzaMinima(distanzaMinima);
		Matrice.getInstance().azzeraMatrice();

		System.out.println("Test Grafo ");
		Nodo A = new Nodo("A");
		Nodo B = new Nodo("B");
		Nodo C = new Nodo("C");
		Nodo D = new Nodo("D");
		Nodo E = new Nodo("E");
		Nodo F = new Nodo("F");
		Nodo G = new Nodo("G");
		Nodo H = new Nodo("H");
		// Matrice.getInstance().stampaMatrice();

		System.out.println("Test Grafo ");

		Integer peso = new Integer(1);
		g.add(A, B, peso);
		g.add(A, C, peso);
		g.add(H, E, peso);
		g.add(C, D, peso);
		g.add(C, E, peso);
		g.add(B, D, peso);
		g.add(E, D, peso);
		g.add(H, G, peso);
		g.add(F, A, peso);
		g.add(G, C, peso);

		System.out.println("Il grafo G e':\n" + g);
		g.drawGrafo();
		System.out.println("L'insieme di archi e': " + g.getInsiemiArchi());

		// stampaMatrice(matrice, w, h);
		System.out.println("END");

	}

}
