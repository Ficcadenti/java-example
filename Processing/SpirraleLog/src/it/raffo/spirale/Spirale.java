package it.raffo.spirale;

import processing.core.PApplet;
import processing.core.PFont;

public class Spirale extends PApplet
{

	static final float NUMRO_AUREO = 1.618f;

	public static void main(String[] args)
	{
		PApplet.main("it.raffo.spirale.Spirale");
	}

	PFont	font;
	float	t		= 0, w, h;
	float	r		= 0;
	float	theta	= 0;
	float	verso	= +1;
	float	a		= 30;

	float	k		= 0;

	@Override
	public void draw()
	{
		this.textFont(this.font);
		this.textSize(15);
		this.fill(0);
		this.noStroke();
		this.rect(0, 0, 300, 200);
		this.fill(0, 255, 0);

		this.text("a     : " + this.a, 100, 60);
		this.text("k     : " + this.k, 100, 80);
		this.text("Theta : " + this.theta, 100, 100);

		// posizionati al centro
		this.translate(this.w / 2, this.h / 2);

		// angolo polare ruotato
		this.theta = radians(this.t);

		// ruota di theta
		this.rotate(this.theta);

		// equazione Spirale aurea
		// r=a*exp((k*theta*log(1+sqrt(5)/2))/PI);
		// r=a*(1+cos(theta));
		// r=100*pow(cos(2*theta/3),3);
		// r=150*(sin(theta)*pow(sin(5*theta/2),3));
		this.r = 150 * (sin(2 * this.theta) * cos(2 * this.theta));
		// r=a*theta;
		// r=pow(a,2)*cos(2*theta);
		// r=150*(sin(theta)+pow(sin(5*theta/2),3));
		// colore verde
		this.stroke(0, 255, 0);
		// la disegno
		this.point(this.r, 0);
		// point(-r,0);
		// incremento l'angolo
		this.t += 0.25;
	}

	@Override
	public void settings()
	{
		this.size(1000, 1000);
	}

	@Override
	public void setup()
	{
		this.frameRate(400);
		this.background(0);

		this.h = this.height;
		this.w = this.width;
		this.font = this.loadFont("AlegreyaSans-Thin-20.vlw");

		this.strokeWeight(1);
		this.stroke(255);
		this.line(0, this.h / 2, this.w, this.h / 2);
		this.line(this.w / 2, 0, this.w / 2, this.h);
		this.strokeWeight(3);
	}

}
