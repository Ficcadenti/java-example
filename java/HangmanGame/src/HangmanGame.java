import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class HangmanGame extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel hp,tried_panel,guess_panel;
	private HangmanPanel hangman_panel;
	
	private Hangstickman hangman;
	
	private ArrayList<CharLabel> guess_word,tried_chars;
	private boolean gameover;
	
	private JPanel contentPane;
	
	public HangmanGame() throws HeadlessException 
	{
		Rectangle2D shape = new Rectangle2D.Float();;
		
		this.getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
                int dfx=getWidth();
                int dfy=getHeight();
                //System.out.printf("dfx=%d,dfy=%d\n",dfx,dfy);
                
                hangman.setFrame(0D,0D,dfx-200D,dfy-200D);
                validate();
        		repaint();
                
            }
        });
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 700, 700);
		setPreferredSize(new Dimension(600, 600));
		setSize(600,600);
		setTitle("The Hangstickman Game !!!! (c) Raffo");
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		 
		shape.setFrame(0,0,400,400);
		hangman = new Hangstickman (shape); 
		 
		hangman_panel=new HangmanPanel();
		hangman_panel.setSize(400,400);
		hangman_panel.setHangstickman(hangman);
		
		hp=new JPanel();
		hp.setBorder(new TitledBorder(null, "L'impiccato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		hp.setLayout(new BorderLayout(0, 0));
		hp.setBackground(Color.LIGHT_GRAY);
		hp.add(hangman_panel, BorderLayout.CENTER);
		
		tried_panel=new JPanel();
		tried_panel.setSize(200, 400);
		tried_panel.setPreferredSize(new Dimension(200, 400));
		tried_panel.setBorder(new TitledBorder(null, "Tentativi", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tried_panel.setBackground(Color.LIGHT_GRAY);
		
		guess_panel=new JPanel();
		guess_panel.setSize(600, 200);
		guess_panel.setPreferredSize(new Dimension(600, 200));
		guess_panel.setBackground(Color.LIGHT_GRAY);
		guess_panel.setBorder(new TitledBorder(null, "Frase da indovinare", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		guess_panel.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent arg0) 
			{
				int len=guess_word.size();
				char c=arg0.getKeyChar();
				Character _c=Character.toUpperCase(c);
				
				
				boolean letteraTrovata=false;
				
				if(gameover==false)
				{
					
					for(int i=0;i<len;i++)
					{
						if(c==guess_word.get(i).getMyChar())
						{
							guess_word.get(i).setTypeD(true);
							
							if (controllaPartitaVinta()) /* hai vinto */
							{
								JOptionPane.showMessageDialog (null, "Hai vinto!!!!", "The Hangstickman Game !!!! (c) Raffo", JOptionPane.INFORMATION_MESSAGE);
							}
							
							letteraTrovata=true;
						}
					}
					
					
					if(letteraTrovata==false)
					{
						if(!isPresent_in_tried_chars(c)) /* carattere NON beccato */
						{
							CharLabel appo2=new CharLabel(c);
							appo2.setTypeD(true);
							tried_chars.add(appo2);
							tried_panel.add(appo2);
							hangman.increaseFigure_to_show();
							
							validate();
							repaint();
							
							if(hangman.getFigure_to_show()==6)
							{
								JOptionPane.showMessageDialog (null, "Hai Perso!!!!", "The Hangstickman Game !!!! (c) Raffo", JOptionPane.ERROR_MESSAGE);
							}

						}
					}
				}
				else
				{
					System.out.println("GAME OVER!!!!!!");
				}
			}
		});

		
		contentPane.add(hp,BorderLayout.CENTER);
		contentPane.add(tried_panel,BorderLayout.EAST);
		contentPane.add(guess_panel,BorderLayout.SOUTH);
		
		gameover = false;
		
		guess_word=new ArrayList<CharLabel>(0);
		tried_chars=new ArrayList<CharLabel>(0);
		
		generateGuessWord();
		 
		guess_panel.setFocusable(true);
		guess_panel.requestFocus(true);
		
		guess_panel.
		validate();
		repaint();
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	public boolean isPresent_in_tried_chars(char c)
	{
		boolean flag=false;
		
		int len=tried_chars.size();
		
		for(int i=0;i<len;i++)
		{
			if(tried_chars.get(i).getMyChar()==c)
			{
				flag=true;
				break;
			}
		}
		
		return flag;
	}
	
	public boolean controllaPartitaVinta()
	{
		boolean partitaVinta=true;
		
		int len=guess_word.size();
		
		for(int i=0;i<len;i++)
		{
			if(guess_word.get(i).getTypeD()==false)
			{
				partitaVinta=false;
				break;
			}
		}
		
		return partitaVinta;
	}
	
	public void stringToCharLabel(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			CharLabel appo=new CharLabel(s.charAt(i));
			guess_word.add(appo);
			guess_panel.add(appo);
		}
	}
	
	public void generateGuessWord()
	{
		Random randomGenerator;
		int randomInt;
		ArrayList<String> strList;
		
		strList=new ArrayList<String>(10);
		strList.add("Valeria Greco");
		strList.add("Sofia Ficcadenti");
		strList.add("Maria Ficcadenti");
		strList.add("Gabriele Ficcadenti");
		strList.add("Luca Ficcadenti");
		strList.add("Francesco Greco");
		strList.add("Enrica Greco");
		strList.add("Angelo Greco");
		
		randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(strList.size());
		
		String s=strList.get(randomInt);
		System.out.printf("Stringa=%s\n",s);
		
		stringToCharLabel(s);
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangmanGame frame = new HangmanGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
