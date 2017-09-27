package it.raffo.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lambda {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");

		System.out.println("1) Maniera standard di utilizzare una lista di stringhe:");

		for (int i = 0; i < strings.size(); i++) {
			System.out.print(strings.get(i));
		}

		System.out.println("\n\n\n2) Utiliziamo i generics:");
		for (String element : strings) {
			System.out.print(element);
		}

		System.out.println("\n\n\n3) Utiliziamo un iterazione interna:");
		strings.forEach(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				// TODO Auto-generated method stub
				System.out.print(arg0);
			}
		});

		System.out.println("\n\n\n4) Utiliziamo una lamda expression:");
		strings.forEach((String s) -> System.out.print(s));

		System.out.println("\n\n\n5) Utiliziamo una lamda expression ancora più sintetica:");
		strings.forEach(s -> System.out.print(s));

		System.out.println("\n\n\n6) Utiliziamo una lamda expression con method reference:");
		strings.forEach(System.out::print);

		System.out.println("\n\n\n=== RunnableTest ===");

		// Anonymous Runnable
		Runnable r1 = new Runnable(){

			@Override
			public void run(){
				System.out.println("Hello world old style!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world with Lambda!");

		r1.run();
		r2.run();   

		// Anonymous ActionListener
		JButton testButton = new JButton("Test Button");
		testButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Detected by Anon Class");
			}

		});

		// Lambda ActionListener
		testButton.addActionListener(e -> System.out.println("Click Detected by Lambda Listner"));

		// Swing stuff
		//		JFrame frame = new JFrame("Listener Test");
		//		frame.add(testButton);
		//		frame.pack();
		//	    frame.setVisible(true);
		//	    
		List<Persona> iscritti = Arrays.asList(
				new Persona("Raffaele", "Ficcadenti", "M", 41, "italiana"),
				new Persona("Valeria", "Greco", "F", 41, "italiana")
				);

		iscritti.forEach(p -> p.stampa());

		MessageSender1 ms = new MessageSender1(); 
		ms.setIscritti(iscritti);
		ms.sendMessage("messaggioX", ms.getGiovaniDonne());
		ms.sendMessage("messaggioY", ms.getMaschi());
		ms.sendMessage("messaggioZ", ms.getStranieri());
		ms.sendMessage("messaggioT", ms.getIscritti());

		MessageSender2 ms2 = new MessageSender2(); 
		ms2.setIscritti(iscritti);
		ms2.sendMessage("messaggioX", ms2.getGiovaniDonne());
		ms2.sendMessage("messaggioY", ms2.getMaschi());
		ms2.sendMessage("messaggioZ", ms2.getStranieri());
		ms2.sendMessage("messaggioT", ms2.getIscritti());


		MessageSender3 ms3 = new MessageSender3(); 
		ms3.setIscritti(iscritti);

		// ------------ invio messaggio per giovani donne ---------------
		ms3.sendMessage("Ciao", ms3.getIscrittiFiltratiPer(
				new ITest<Persona>(){

					@Override
					public boolean test(Persona p) {
						// TODO Auto-generated method stub
						return p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 50;
					}

				}
				));

		MessageSender4 ms4 = new MessageSender4(); 
		ms4.setIscritti(iscritti);
		
		Predicate<Persona> allMaschi = p -> p.getSesso().equals("M");
		
		ms4.sendMessage("Maschi",  ms4.getIscrittiFiltratiPer(allMaschi));
		ms4.sendMessage("tutti ad imparare Java",  ms4.getIscritti());
		
	}



}
