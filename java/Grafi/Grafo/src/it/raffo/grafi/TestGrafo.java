package it.raffo.grafi;

public class TestGrafo
{
	public static int	contNodo		= 1;
	public static int	distanzaMinima	= 5;
	public static int	h				= 50;
	public static int	raggio			= 2;
	public static int	w				= 50;

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
		int possibileCentroX = (int) (Math.random() * 999);
		int possibileCentroY = (int) (Math.random() * 999);
		Centro c = new Centro(possibileCentroX, possibileCentroY);
		while (!isVuotoNeiDintorni(c, m))
		{
			possibileCentroX = (int) (Math.random() * 999);
			possibileCentroY = (int) (Math.random() * 999);
			c = new Centro(possibileCentroX, possibileCentroY);
		}
		System.out.println("trovato centro: " + c);
		stampaCentroSuMatrice(c, m);
		return c;
	}

	private static boolean isVuotoNeiDintorni(Centro c, int[][] m)
	{
		boolean bRet = true;
		// controllo se sono al margine della matrice tenendo conto del raggio
		if ((c.getX() - raggio) < 0)
		{
			return false;
		}
		if ((c.getX() + raggio) >= w)
		{
			return false;
		}
		if ((c.getY() - raggio) < 0)
		{
			return false;
		}
		if ((c.getY() + raggio) >= h)
		{
			return false;
		}

		for (int x = c.getX() - (raggio); x < (c.getX() + (raggio)); x++)
		{
			for (int y = c.getY() - (raggio); y < (c.getY() + (raggio)); y++)
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

		int matrice[][] = new int[w][h];
		azzeraMatrice(matrice, w, h);

		System.out.println("Test Grafo - 15-03/2019 - Raffo - raffaele.ficcadenti@gmail.com");

		Grafo g = new Grafo();
		Centro cA = calcolaCentro(matrice);
		Nodo A = new Nodo(cA, "A");
		Centro cB = calcolaCentro(matrice);
		Nodo B = new Nodo(cB, "B");
		Centro cC = calcolaCentro(matrice);
		Nodo C = new Nodo(cC, "C");
		Centro cD = calcolaCentro(matrice);
		Nodo D = new Nodo(cD, "D");
		Centro cE = calcolaCentro(matrice);
		Nodo E = new Nodo(cE, "E");
		Integer peso = new Integer(1);

		g.add(A, B, peso);
		g.add(A, C, peso);
		g.add(A, E, peso);
		g.add(C, D, peso);
		g.add(C, E, peso);
		g.add(B, D, peso);

		System.out.println("Il grafo G e':\n" + g);
		System.out.println("L'insieme di archi e': " + g.getInsiemiArchi());

		// stampaMatrice(matrice, w, h);
		System.out.println("END");

	}

	private static void stampaCentroSuMatrice(Centro c, int[][] m)
	{
		for (int x = c.getX() - (raggio); x < (c.getX() + (raggio)); x++)
		{
			for (int y = c.getY() - (raggio); y < (c.getY() + (raggio)); y++)
			{
				m[x][y] = contNodo;
			}
		}
		contNodo++;

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

}
