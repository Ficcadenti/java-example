import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Hangstickman
{
	private int			figure_to_show;
	private Ellipse2D	head;
	private Line2D		rope, body, left_arm, right_arm, left_leg, right_leg;
	private double		dx, dy;
	private Rectangle2D	rect;
	private double		delta	= 0D;

	public Hangstickman(Rectangle2D rect)
	{
		this.figure_to_show = 0;
		this.dy = rect.getHeight();
		this.dx = rect.getWidth();
		this.rect = rect;
	}

	public void draw(Graphics2D g2)
	{
		this.rope = new Line2D.Double();
		this.rope.setLine(this.dx / 2, 0D, this.dx / 2, this.dy * 0.1D);

		this.head = new Ellipse2D.Double();
		this.head.setFrame(0d, this.dy * 0.1D, this.dx - 10, (this.dy * 0.4D) - (this.dy * 0.1D));

		this.left_arm = new Line2D.Double();
		this.left_arm.setLine(this.dx / 2, this.dy * 0.4D, 0, this.dy * 0.6D);

		this.right_arm = new Line2D.Double();
		this.right_arm.setLine(this.dx / 2, this.dy * 0.4D, this.dx, this.dy * 0.6D);

		this.body = new Line2D.Double();
		this.body.setLine(this.dx / 2, this.dy * 0.4D, this.dx / 2, this.dy * 0.7D);

		this.left_leg = new Line2D.Double();
		this.left_leg.setLine(this.dx / 2, this.dy * 0.7D, 0, this.dy * 1D);

		this.right_leg = new Line2D.Double();
		this.right_leg.setLine(this.dx / 2, this.dy * 0.7D, this.dx, this.dy * 1D);

		g2.draw(this.rope);
		if (this.figure_to_show >= 1)
		{
			g2.draw(this.head);
		}

		if (this.figure_to_show >= 2)
		{
			g2.draw(this.left_arm);
		}

		if (this.figure_to_show >= 3)
		{
			g2.draw(this.body);
		}

		if (this.figure_to_show >= 4)
		{
			g2.draw(this.right_arm);
		}

		if (this.figure_to_show >= 5)
		{
			g2.draw(this.left_leg);
		}

		if (this.figure_to_show >= 6)
		{
			g2.draw(this.right_leg);
		}
	}

	public int getFigure_to_show()
	{
		return this.figure_to_show;
	}

	public void increaseFigure_to_show()
	{
		this.figure_to_show++;
	}

	public void setFigure_to_show(int figure_to_show)
	{
		this.figure_to_show = figure_to_show;
	}

	public void setFrame(Double x, Double y, Double x1, Double y1)
	{
		this.rect.setFrame(x, y, x1, y1);
		this.dy = this.rect.getHeight();
		this.dx = this.rect.getWidth();
	}

}
