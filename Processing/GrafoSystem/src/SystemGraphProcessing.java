import java.io.File;
import java.util.Arrays;
import java.util.List;

import processing.core.PApplet;

public class SystemGraphProcessing extends PApplet
{

	public static int diametro = 10;

	public static void main(String[] args)
	{
		PApplet.main("SystemGraphProcessing");
		// Matrice.getIstance().stampaMatrice();

	}

	private Nodo	cartellaPartenza;
	private String	path		= "d:\\prova";

	private File	rootFile	= new File(this.path);

	public void disegnaDirectory(Nodo nodo)
	{
		this.noFill();
		this.stroke(255);
		this.ellipse(nodo.posX, nodo.posY, diametro, diametro);
		this.fill(0);
		this.ellipse(nodo.posX, nodo.posY, diametro - 10, diametro - 10);
		this.fill(255, 0, 0);
		this.textAlign(CENTER);
		this.textSize(13);
		this.text("(D) " + nodo.nome, nodo.posX, nodo.posY - 40);
	}

	void disegnaFigli(File[] listaFigli, Nodo cartellaPartenza)
	{

		for (int x = 0; x < listaFigli.length; x++)
		{
			Nodo cartellaFiglio = new Nodo();
			cartellaFiglio.setNome(listaFigli[x].getName());
			cartellaFiglio.setFigli(listaFigli[x].listFiles());
			cartellaFiglio.setPosX(this.random(this.width));
			cartellaFiglio.setPosY(this.random(this.height));
			this.disegnaLinea(cartellaPartenza, cartellaFiglio);
			if (listaFigli[x].isDirectory())
			{
				this.disegnaDirectory(cartellaFiglio);
				this.disegnaLinea(cartellaPartenza, cartellaFiglio);
				this.disegnaFigli(cartellaFiglio.figli, cartellaFiglio);
			}
			else
			{
				this.disegnaFile(cartellaFiglio);
			}
		}
	}

	public void disegnaFile(Nodo nodo)
	{
		this.noFill();
		this.stroke(255, 0, 0);
		this.ellipse(nodo.posX, nodo.posY, diametro, diametro);
		this.fill(0);
		this.ellipse(nodo.posX, nodo.posY, diametro - 10, diametro - 10);
		this.fill(255, 0, 0);
		this.textAlign(CENTER);
		this.textSize(13);
		this.text("(F) " + nodo.nome, nodo.posX, nodo.posY - 40);
		this.ellipse(nodo.posX, nodo.posY, 10, 10);
	}

	public void disegnaLinea(Nodo cartellaPadre, Nodo cartellaFiglio)
	{
		this.stroke(255);
		this.line(cartellaPadre.posX, cartellaPadre.posY, cartellaFiglio.posX, cartellaFiglio.posY);
	}

	@Override
	public void draw()
	{
	}

	public void leggiCartella(File filePartenza)
	{
		this.cartellaPartenza = new Nodo();
		this.cartellaPartenza.setNome(this.rootFile.getName());
		File[] listaFigli = filePartenza.listFiles();
		List<File> list = Arrays.asList(listaFigli);
		list.forEach(f -> System.out.println(f.getName()));
		this.cartellaPartenza.setFigli(listaFigli);
		this.cartellaPartenza.setPosX(this.random(this.width));
		this.cartellaPartenza.setPosY(this.random(this.height));
		this.disegnaDirectory(this.cartellaPartenza);
		this.disegnaFigli(listaFigli, this.cartellaPartenza);
	}

	@Override
	public void settings()
	{
		this.size(800, 800);
	}

	@Override
	public void setup()
	{
		this.background(0);
		this.leggiCartella(this.rootFile);
	}
}
