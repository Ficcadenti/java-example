package it.raffo.generic.client;

import it.raffo.generic.myStack;

public class Generic_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.printf("Generic - Classi !!!!\n");
		myStack<String> st=new myStack<String>(30);
		try {
			st.push("a");
			st.push("b");
			st.push("c");
			st.push("d");
			
			int i=0;
			String s;
			
			while((s=st.pop()) != null)
			{
				System.out.printf("%d) %s \n",i++,s);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("Errore %s!!!!\n",e.getMessage());
		}
	}

}
