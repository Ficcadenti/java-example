import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Hangstickman 
{
	private int 		figure_to_show;
	private Ellipse2D 	head;
	private Line2D 		rope,body,left_arm,right_arm,left_leg,right_leg;
	private double 		dx,dy;
	private Rectangle2D rect;
	private double 		delta = 0D;
	
	public Hangstickman(Rectangle2D rect) {
		figure_to_show=0;
		dy=rect.getHeight();
		dx=rect.getWidth();
		this.rect=rect;
	}
	
	public void setFrame(Double x,Double y,Double x1,Double y1)
	{
		rect.setFrame(x,y,x1,y1);
		dy=rect.getHeight();
		dx=rect.getWidth();
	}
	
	public void increaseFigure_to_show()
	{
		figure_to_show++;
	}

	public int getFigure_to_show() 
	{
		return figure_to_show;
	}

	public void setFigure_to_show(int figure_to_show) 
	{
		this.figure_to_show = figure_to_show;
	}
	
	public void draw(Graphics2D g2)
	{
		rope=new Line2D.Double();
		rope.setLine(dx/2,0D,dx/2,dy*0.1D); 
		
		head=new Ellipse2D.Double();
		head.setFrame(0d, dy*0.1D, dx, dy*0.4D-dy*0.1D);
		
		left_arm=new Line2D.Double();
		left_arm.setLine(dx/2,dy*0.4D,0,dy*0.6D);
		
		
		right_arm=new Line2D.Double();
		right_arm.setLine(dx/2,dy*0.4D,dx,dy*0.6D);
		
		body=new Line2D.Double();
		body.setLine(dx/2,dy*0.4D,dx/2,dy*0.7D);
		
		left_leg=new Line2D.Double();
		left_leg.setLine(dx/2,dy*0.7D,0,dy*1D);
		
		right_leg=new Line2D.Double();
		right_leg.setLine(dx/2,dy*0.7D,dx,dy*1D);
		
		g2.draw(rope);
		if(figure_to_show>=1)
			g2.draw(head);
		
		if(figure_to_show>=2)
			g2.draw(left_arm);
		
		if(figure_to_show>=3)
			g2.draw(body);
		
		if(figure_to_show>=4)
			g2.draw(right_arm);
		
		if(figure_to_show>=5)
			g2.draw(left_leg);
		
		if(figure_to_show>=6)
			g2.draw(right_leg);
	}

}
