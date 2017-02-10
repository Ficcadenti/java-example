package com.raffo.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class testFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static bean_test1 bean_test1_ = new bean_test1();
	private static bean_contatto contatto = new bean_contatto();
	private static bean_bound bb=new bean_bound();
	private static bean_constrained bc=new bean_constrained();
	
	private static PhotoAlbum p;
	private static JLabel lblNewLabel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					testFrame frame = new testFrame();
					frame.setSize(500,400);
					frame.setVisible(true);

					p = new PhotoAlbum();
					frame.getContentPane().add(p,BorderLayout.CENTER);

					p.addPropertyChangeListener(new PropertyChangeListener() 
					{
						public void propertyChange(PropertyChangeEvent e) 
						{
							if(e.getPropertyName()=="imageComment")
							{
								System.out.println(e.getPropertyName() + ": " + e.getNewValue());
								lblNewLabel.setText("Photo Album - "+ e.getNewValue());
							}
						}
					});

					p.showNext();

				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
		bc.addVetoableChangeListener(new VetoableChangeListener() {
			
			@Override
			public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
				// TODO Auto-generated method stub
				if(evt.getPropertyName()=="email")
				{
					System.out.println("Constrained: "+evt.getPropertyName() + ": " + evt.getNewValue());
					throw new PropertyVetoException("Messagio di eccezzione per il vincolo sulla proprietà email del bean 'bean_constrained' !!!",evt);
				}
			}
		});

		bb.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) 
			{
				if(e.getSource() == bb)
				{
					if(e.getPropertyName() == "email")
					{
						System.out.println(e.getPropertyName() + " è  cambiata: new=" + e.getNewValue()+"; old="+e.getOldValue());
					}
				}
			}
		});

		contatto.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) 
			{
				if(e.getSource() == contatto)
				{
					System.out.println(e.getPropertyName() + ": new=" + e.getNewValue()+"; old="+e.getOldValue());
				}
			}
		});

		bean_test1_.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) 
			{
				if(e.getSource() == bean_test1_)
				{
					System.out.println(e.getPropertyName() + ": new=" + e.getNewValue()+"; old="+e.getOldValue());
				}
			}
		});
	}

	public testFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JButton btnNewButton_2 = new JButton("Next Image");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btnNewButton_2.isEnabled()) {
					System.out.println("Add Button is pressed");
					bean_test1_.setMyString("Raffaele");
					bean_test1_.validate();
					bean_test1_.repaint();
					System.out.println("get bean:"+bean_test1_.getMyString());
					contatto.setEmail("raffaele.ficcadenti@gmail.com");
					bb.setEmail("valeria.greco@gmail.com");

						try {
							bc.setEmail("valeria.greco@gmail.com");
						} catch (PropertyVetoException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage()+"   email="+bc.getEmail());
						}
					
					p.showNext();
				}
				if (!btnNewButton_2.isEnabled()) {
					System.out.println("Add Button is not pressed");
				}
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);

		lblNewLabel = new JLabel("Photo Album - JavaBean esempio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);


		//contentPane.add(bean_test1_, BorderLayout.CENTER);
	}

}
