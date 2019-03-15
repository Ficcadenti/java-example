package it.raffo.alberi;

import java.io.File;

import processing.core.PApplet;

public class FileSystem
{
	private Nodo	root;
	private PApplet	pa;
	private int		deltaX;
	private int		deltaY;
	private int		y;

	public FileSystem(PApplet pa)
	{
		super();
		this.pa = pa;
		this.root = null;
		this.deltaX = 50;
		this.deltaY = 50;
		this.y = 50;
	}

	void drawArrow(int cx, int cy, int len, float angle)
	{
		this.pa.pushMatrix();
		this.pa.translate(cx, cy);
		this.pa.rotate(this.pa.radians(angle));
		this.pa.line(0, 0, len, 0);
		this.pa.line(len, 0, len - 8, -8);
		this.pa.line(len, 0, len - 8, 8);
		this.pa.popMatrix();
	}

	public int getDeltaY()
	{
		return this.deltaY;
	}

	public PApplet getPa()
	{
		return this.pa;
	}

	public Nodo getRoot()
	{
		return this.root;
	}

	public int getY()
	{
		return this.y;
	}

	public void ls(File file)
	{
		if (this.root == null)
		{
			String type;
			long size = 0;
			if (file.isDirectory())
			{
				type = "D";
			}
			else
			{
				type = "F";
				size = file.length();
			}

			this.root = new Nodo(new Elemento(file.getName(), type, size, file));
			this.ls(this.root);
		}
	}

	private void ls(Nodo nodoCorrente)
	{
		File[] filesList = nodoCorrente.getElem().getFile().listFiles();
		for (File f : filesList)
		{
			if (f.isDirectory() && !f.isHidden())
			{
				Nodo n = new Nodo(new Elemento(f.getName(), "D", f.length(), f));
				nodoCorrente.addFiglio(n);
				this.ls(n);
			}
			if (f.isFile())
			{
				Nodo n = new Nodo(new Elemento(f.getName(), "F", f.length(), f));
				nodoCorrente.addFiglio(n);
			}
		}
	}

	public void setDeltaY(int deltaY)
	{
		this.deltaY = deltaY;
	}

	public void setPa(PApplet pa)
	{
		this.pa = pa;
	}

	public void setRoot(Nodo root)
	{
		this.root = root;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public String space(int n)
	{
		String str = "";
		for (int i = 0; i < n; i++)
		{
			str = str + " ";
		}
		return str;
	}

	public void stampaAlbero()
	{
		if (this.root != null)
		{
			String str = this.root.getElem().getNome() + " (" + this.root.getElem().getType() + ")";
			System.out.println(str);
			this.stampaTxtFx(str, 50);
			this.stampaAlbero(this.root, 50 + this.deltaX);
		}

	}

	public void stampaAlbero(Nodo nodoCorrente, int x)
	{

		if (nodoCorrente.getFigli() != null)
		{
			for (Nodo n : nodoCorrente.getFigli())
			{
				String str = n.getElem().getNome() + " (" + n.getElem().getType() + ")";
				this.stampaTxtFx(str, x);

				if (n.getElem().getType().equalsIgnoreCase("D"))
				{
					this.stampaAlbero(n, x + this.deltaX);
					this.drawArrow(x, this.y, x + this.deltaX, this.y + this.deltaY);
				}
			}
		}
	}

	public void stampaTxtFx(String str, int x)
	{
		this.pa.pushMatrix();
		this.pa.noFill();
		this.pa.stroke(255);
		int startX = x - 10;
		int startY = this.y - 15;
		int DX = str.length() * 7;
		int DY = 20;
		this.pa.rect(startX, startY, DX, DY);
		int riquadro = 3;
		this.pa.rect(startX - riquadro, startY - riquadro, DX + (riquadro * 2), DY + (riquadro * 2));

		this.pa.fill(this.pa.random(255), this.pa.random(255), this.pa.random(255));
		this.pa.color(this.pa.random(255), this.pa.random(255), this.pa.random(255));
		this.pa.text(str, x, this.y);
		this.pa.popMatrix();
		this.y += this.deltaY;
	}

}
