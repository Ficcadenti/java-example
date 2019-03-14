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

	@Override
	public void draw()
	{
	}

	@Override
	public void settings()
	{
		this.size(1280, 1280);
	}

	@Override
	public void setup()
	{
		this.background(0);
		fs = new FileSystem(this);
		fs.ls(new File("D:\\doganeprj"));
		fs.stampaAlbero();

	}

}
