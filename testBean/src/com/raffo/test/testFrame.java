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
import java.awt.event.ActionEvent;

public class testFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static bean_test1 bean_test1_ = new bean_test1();
	private static bean_test1 bean_test2_ = new bean_test1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
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
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btnNewButton_2.isEnabled()) {
		            System.out.println("Add Button is pressed");
		            bean_test1_.setMyString("Raffaele");
		            bean_test1_.validate();
		            bean_test1_.repaint();
		            System.out.println("get bean:"+bean_test1_.getMyString());
		        }
		        if (!btnNewButton_2.isEnabled()) {
		            System.out.println("Add Button is not pressed");
		        }
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		
		contentPane.add(bean_test1_, BorderLayout.CENTER);
	}

}
