import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import javax.swing.JPanel;


/**
 * @author Valeria
 *
 */
public class HangmanPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hangstickman hangman;
	
	/**
	 * 
	 */
	public HangmanPanel() 
	{
		super();
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout(0, 0));
		setBackground(Color.LIGHT_GRAY);
	}
	
	public void paintComponent (Graphics g)
	{
	    super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g; 
	    hangman.draw(g2);
	}
	
	
	public void setHangstickman(Hangstickman hangman)
	{
		this.hangman=hangman;
	}



}
