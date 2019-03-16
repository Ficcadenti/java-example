package it.raffo.grafi;

import processing.core.PApplet;

public class TestGrafo extends PApplet
{
	public static int	distanzaMinima	= 30;
	public static int	h				= 1000;
	public static int	raggio			= 40;
	public static int	w				= 1000;

	public static void azzeraMatrice(int[][] m, int w, int h)
	{
		for (int x = 0; x < w; x++)
		{
			for (int y = 0; y < h; y++)
			{
				m[x][y] = 0;
			}
		}
	}

	private static Centro calcolaCentro(int[][] m)
	{
		int possibileCentroX = (int) (Math.random() * w);
		int possibileCentroY = (h);
		Centro c = new Centro(possibileCentroX, possibileCentroY);
		while (!isVuotoNeiDintorni(c, m))
		{
			possibileCentroX = (int) (Math.random() * w);
			possibileCentroY = (int) (Math.random() * h);
			c = new Centro(possibileCentroX, possibileCentroY);
		}
		System.out.println("trovato centro: " + c);
		stampaCentroSuMatrice(c, m);
		return c;
	}

	private static boolean isVuotoNeiDintorni(Centro c, int[][] m)
	{
		boolean bRet = true;
		int recinto = raggio + distanzaMinima;

		// controllo se sono al margine della matrice tenendo conto del raggio
		if ((c.getX() - recinto) < 0)
		{
			return false;
		}
		if ((c.getX() + recinto) >= w)
		{
			return false;
		}
		if ((c.getY() - recinto) < 0)
		{
			return false;
		}
		if ((c.getY() + recinto) >= h)
		{
			return false;
		}

		for (int x = c.getX() - (recinto); x < (c.getX() + (recinto)); x++)
		{
			for (int y = c.getY() - (recinto); y < (c.getY() + (recinto)); y++)
			{
				if (m[x][y] == 1)
				{
					bRet = false;
					break;
				}
			}
		}
		return bRet;

	}

	public static void main(String[] args)
	{
		PApplet.main("it.raffo.grafi.TestGrafo");
	}

	private static void stampaCentroSuMatrice(Centro c, int[][] m)
	{
		int recinto = raggio + distanzaMinima;
		for (int x = c.getX() - (recinto); x < (c.getX() + (recinto)); x++)
		{
			for (int y = c.getY() - (recinto); y < (c.getY() + (recinto)); y++)
			{
				m[x][y] = 1;
			}
		}
	}

	private static void stampaMatrice(int[][] m, int w, int h)
	{
		for (int y = 0; y < h; y++)
		{
			for (int x = 0; x < w; x++)
			{
				System.out.print(m[x][y]);
			}
			System.out.println();
		}

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
		int matrice[][] = new int[w][h];
		azzeraMatrice(matrice, w, h);

		System.out.println("Test Grafo - 15-03/2019 - Raffo - raffaele.ficcadenti@gmail.com");

		Grafo g = new Grafo(this);
		g.setRaggio(raggio);
		Centro c = calcolaCentro(matrice);
		Nodo A = new Nodo(c, "A");
		c = calcolaCentro(matrice);
		Nodo B = new Nodo(c, "B");
		c = calcolaCentro(matrice);
		Nodo C = new Nodo(c, "C");
		c = calcolaCentro(matrice);
		Nodo D = new Nodo(c, "D");
		c = calcolaCentro(matrice);
		Nodo E = new Nodo(c, "E");
		c = calcolaCentro(matrice);
		Nodo F = new Nodo(c, "F");
		c = calcolaCentro(matrice);
		Nodo G = new Nodo(c, "G");
		c = calcolaCentro(matrice);
		Nodo H = new Nodo(c, "H");

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
