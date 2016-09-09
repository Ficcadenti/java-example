
import java.awt.Font;

import javax.swing.JLabel;

public class CharLabel extends JLabel {

	private	boolean typed;
	private char myChar;

	private static final long serialVersionUID = 1L;

	public CharLabel(char c) {
		super();
		setFont(new Font("Courier New", Font.ITALIC, 22));
		if(c == ' ')
		{
			typed=true;
			setText(" ");
		}
		else
		{
			typed=false;
			setText("_");
		}
		myChar=c;
	}
	
	public CharLabel()
	{
		super();
		myChar=' ';
		typed=false;
	}

	public void setMyChar(char c)
	{
		myChar=c;
	}
	
	public char getMyChar()
	{
		return myChar;
	}
	
	public void setTypeD(boolean t)
	{
		if(t)
		{
			setText(""+myChar);
		}
		typed=t;
	}
	
	public boolean getTypeD()
	{
		return typed;
	}
	
	
}
