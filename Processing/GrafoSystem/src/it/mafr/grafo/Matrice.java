package it.mafr.grafo;

public class Matrice
{

	private static Matrice matrice_istanza = null;

	public static Matrice getIstance()
	{
		if (matrice_istanza == null)
		{
			matrice_istanza = new Matrice();
		}
		return matrice_istanza;
	}

	private int		diametro	= SystemGraphProcessing.diametro;

	private int		h;
	private int		w;
	private int[][]	matrice		= null;

	private Matrice()
	{

	}

	public void azzeraMatrice()
	{
		this.matrice = new int[this.w][this.h];
		System.out.println(this.w);
		System.out.println(this.h);
		for (int x = 0; x < this.w; x++)
		{
			for (int y = 0; y < this.h; y++)
			{
				this.matrice[x][y] = 0;
			}
		}
	}

	public boolean controllaSeSicuro(Centro c)
	{
		int partenzaCortileX = c.x - (this.diametro / 2);
		System.out.println("partenzaCortileX ----->" + partenzaCortileX);
		int arrivoCortileX = c.x + (this.diametro / 2);
		System.out.println("arrivoCortileX ----->" + arrivoCortileX);
		int partenzaCortileY = c.y - (this.diametro / 2);
		System.out.println("partenzaCortileY ----->" + partenzaCortileY);
		int arrivoCortileY = c.y + (this.diametro / 2);
		System.out.println("arrivoCortileY ----->" + arrivoCortileY);

		for (int x = partenzaCortileX; x < arrivoCortileX; x++)
		{
			for (int y = partenzaCortileY; y < arrivoCortileY; y++)
			{
				if (this.matrice[x][y] == 1)
				{
					return false;
				}
			}
		}
		return true;
	}

	public Centro generaCentro(int collisioni)
	{
		System.out.println("Collisione n°: " + collisioni);
		int ipotesiX = (int) ((Math.random() * this.w) - 1);
		int ipotesiY = (int) ((Math.random() * this.h) - 1);
		Centro centroIpotetico = new Centro(ipotesiX, ipotesiY);
		System.out.println("Centro ipotetico(diametro=" + this.diametro + "): " + centroIpotetico);

		if ((ipotesiX < this.diametro) || (ipotesiX >= (this.w - this.diametro)))
		{
			System.out.println("fuori x");
			this.generaCentro(++collisioni);
		}
		else if ((ipotesiY < this.diametro) || (ipotesiY >= (this.h - this.diametro)))
		{
			System.out.println("fuori y");
			this.generaCentro(++collisioni);
		}

		if (this.controllaSeSicuro(centroIpotetico) == false)
		{
			System.out.println("Collisione n°: " + collisioni);
			this.generaCentro(++collisioni);
		}
		this.marcaMatrice(centroIpotetico);
		return centroIpotetico;
	}

	public int getDiametro()
	{
		return this.diametro;
	}

	public int getH()
	{
		return this.h;
	}

	public int getW()
	{
		return this.w;
	}

	public void marcaMatrice(Centro c)
	{
		int partenzaCortileX = c.x - (this.diametro / 2);
		int arrivoCortileX = c.x + (this.diametro / 2);
		int partenzaCortileY = c.y - (this.diametro / 2);
		int arrivoCortileY = c.y + (this.diametro / 2);

		for (int x = partenzaCortileX; x < arrivoCortileX; x++)
		{
			for (int y = partenzaCortileY; y < arrivoCortileY; y++)
			{
				this.matrice[x][y] = 1;
			}
		}
	}

	public void setDiametro(int diametro)
	{
		this.diametro = diametro;
	}

	public void setH(int h)
	{
		this.h = h;
	}

	public void setW(int w)
	{
		this.w = w;
	}

	public void stampaMatrice()
	{
		for (int x = 1; x < this.w; x++)
		{
			System.out.println("");
			for (int y = 1; y < this.h; y++)
			{
				System.out.print(this.matrice[x][y]);
			}
		}
	}
}
