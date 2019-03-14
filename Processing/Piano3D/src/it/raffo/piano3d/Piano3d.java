package it.raffo.piano3d;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class Piano3d extends PApplet
{

	static final float NUMRO_AUREO = 1.618f;

	public static void main(String[] args)
	{
		PApplet.main("it.raffo.piano3d.Piano3d");
	}

	PImage	img;
	PShape	globe;
	float	t		= 0, o = 0, w, h;
	float	theta	= 0, omega = 0;

	@Override
	public void draw()
	{

		// this.translate(this.width / 2, this.height / 2);
		// this.beginShape();
		// this.shape(this.globe);
		// this.endShape();

		// posizionati al centro
		this.translate(this.w / 2, this.h / 2);

		// angolo polare ruotato
		this.theta = radians(this.t);
		// ruota di theta
		this.rotate(this.theta);

		// la coloro
		this.stroke(0, 255, 0);
		// la disegno
		float r = 200 * (sin(this.theta) + pow(sin((5 * this.theta) / 2), 3));
		this.point(r, 0, 0);

		this.t += 0.25;
	}

	@Override
	public void settings()
	{
		this.size(1000, 1000, P3D);
	}

	@Override
	public void setup()
	{
		this.background(0);
		this.img = this.loadImage("earth.jpg");
		this.globe = this.createShape(SPHERE, 150);
		this.globe.setTexture(this.img);
		this.h = this.height;
		this.w = this.width;
	}
}
