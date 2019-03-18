package it.raffo.alberi;

import java.io.File;

import processing.core.PApplet;

public class TestFS extends PApplet
{
	static FileSystem fs;

	public static void main(String[] args)
	{
		PApplet.main("it.raffo.alberi.TestFS");
	}

	int	h	= 1900;
	int	w	= 1600;

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
			this.point(this.random(0, this.w), this.random(0, this.h));
		}
	}

	@Override
	public void settings()
	{
		this.size(this.w, this.h);
	}

	@Override
	public void setup()
	{
		this.background(0);
		this.generaPunti(200);
		fs = new FileSystem(this, this.h, this.w);
		fs.ls(new File("D:\\doganeprj"));
		fs.stampaAlbero();

	}

}
