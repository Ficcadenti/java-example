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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					HangmanGame frame = new HangmanGame();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel					hp, tried_panel, guess_panel;

	private HangmanPanel			hangman_panel;

	private Hangstickman			hangman;
	private ArrayList<CharLabel>	guess_word, tried_chars;

	private boolean					gameover;

	private JPanel					contentPane;

	public HangmanGame() throws HeadlessException
	{
		Rectangle2D shape = new Rectangle2D.Float();
		;

		this.getRootPane().addComponentListener(new ComponentAdapter()
		{
			@Override
			public void componentResized(ComponentEvent e)
			{
				// This is only called when the user releases the mouse button.
				int dfx = HangmanGame.this.getWidth();
				int dfy = HangmanGame.this.getHeight();
				// System.out.printf("dfx=%d,dfy=%d\n",dfx,dfy);

				HangmanGame.this.hangman.setFrame(0D, 0D, dfx - 200D, dfy - 200D);
				HangmanGame.this.validate();
				HangmanGame.this.repaint();

			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 700, 700);
		this.setPreferredSize(new Dimension(600, 600));
		this.setSize(600, 600);
		this.setTitle("The Hangstickman Game !!!! (c) Raffo");
		this.contentPane = new JPanel();
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(this.contentPane);

		shape.setFrame(0, 0, 400, 400);
		this.hangman = new Hangstickman(shape);

		this.hangman_panel = new HangmanPanel();
		this.hangman_panel.setSize(400, 400);
		this.hangman_panel.setHangstickman(this.hangman);

		this.hp = new JPanel();
		this.hp.setBorder(new TitledBorder(null, "L'impiccato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.hp.setLayout(new BorderLayout(0, 0));
		this.hp.setBackground(Color.LIGHT_GRAY);
		this.hp.add(this.hangman_panel, BorderLayout.CENTER);

		this.tried_panel = new JPanel();
		this.tried_panel.setSize(200, 400);
		this.tried_panel.setPreferredSize(new Dimension(200, 400));
		this.tried_panel
				.setBorder(new TitledBorder(null, "Tentativi", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.tried_panel.setBackground(Color.LIGHT_GRAY);

		this.guess_panel = new JPanel();
		this.guess_panel.setSize(600, 200);
		this.guess_panel.setPreferredSize(new Dimension(600, 200));
		this.guess_panel.setBackground(Color.LIGHT_GRAY);
		this.guess_panel.setBorder(
				new TitledBorder(null, "Frase da indovinare", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.guess_panel.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent arg0)
			{
				int len = HangmanGame.this.guess_word.size();
				char c = arg0.getKeyChar();
				Character _c = Character.toUpperCase(c);

				boolean letteraTrovata = false;

				if (HangmanGame.this.gameover == false)
				{

					for (int i = 0; i < len; i++)
					{
						if (c == HangmanGame.this.guess_word.get(i).getMyChar())
						{
							HangmanGame.this.guess_word.get(i).setTypeD(true);

							if (HangmanGame.this.controllaPartitaVinta()) /* hai vinto */
							{
								JOptionPane.showMessageDialog(null, "Hai vinto!!!!",
										"The Hangstickman Game !!!! (c) Raffo", JOptionPane.INFORMATION_MESSAGE);
							}

							letteraTrovata = true;
						}
					}

					if (letteraTrovata == false)
					{
						if (!HangmanGame.this.isPresent_in_tried_chars(c)) /* carattere NON beccato */
						{
							CharLabel appo2 = new CharLabel(c);
							appo2.setTypeD(true);
							HangmanGame.this.tried_chars.add(appo2);
							HangmanGame.this.tried_panel.add(appo2);
							HangmanGame.this.hangman.increaseFigure_to_show();

							HangmanGame.this.validate();
							HangmanGame.this.repaint();

							if (HangmanGame.this.hangman.getFigure_to_show() == 6)
							{
								JOptionPane.showMessageDialog(null, "Hai Perso!!!!",
										"The Hangstickman Game !!!! (c) Raffo", JOptionPane.ERROR_MESSAGE);
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

		this.contentPane.add(this.hp, BorderLayout.CENTER);
		this.contentPane.add(this.tried_panel, BorderLayout.EAST);
		this.contentPane.add(this.guess_panel, BorderLayout.SOUTH);

		this.gameover = false;

		this.guess_word = new ArrayList<CharLabel>(0);
		this.tried_chars = new ArrayList<CharLabel>(0);

		this.generateGuessWord();

		this.guess_panel.setFocusable(true);
		this.guess_panel.requestFocus(true);

		this.guess_panel.validate();
		this.repaint();
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	public boolean controllaPartitaVinta()
	{
		boolean partitaVinta = true;

		int len = this.guess_word.size();

		for (int i = 0; i < len; i++)
		{
			if (this.guess_word.get(i).getTypeD() == false)
			{
				partitaVinta = false;
				break;
			}
		}

		return partitaVinta;
	}

	public void generateGuessWord()
	{
		Random randomGenerator;
		int randomInt;
		ArrayList<String> strList;

		strList = new ArrayList<String>(10);
		strList.add("Matrici");
		strList.add("Grafi");
		strList.add("Alberi");

		randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(strList.size());

		String s = strList.get(randomInt);
		System.out.printf("Stringa=%s\n", s);

		this.stringToCharLabel(s);

	}

	public boolean isPresent_in_tried_chars(char c)
	{
		boolean flag = false;

		int len = this.tried_chars.size();

		for (int i = 0; i < len; i++)
		{
			if (this.tried_chars.get(i).getMyChar() == c)
			{
				flag = true;
				break;
			}
		}

		return flag;
	}

	public void stringToCharLabel(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			CharLabel appo = new CharLabel(s.charAt(i));
			this.guess_word.add(appo);
			this.guess_panel.add(appo);
		}
	}

}
