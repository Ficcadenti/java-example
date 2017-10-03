package it.raffo.generic.client;

import it.raffo.generic.myStack;

public class Generic_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.printf("Generic - Classi !!!!\n");
		myStack<String> st=new myStack<String>(30);
		myStack st_raw=new myStack(30);
		
		try {
			st_raw.push(1);
			st_raw.push("a");
			
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
			
			Object o;
			while((o=st_raw.pop()) != null)
			{
				System.out.printf("%d) %s [%s] \n",i++,o,o.getClass());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("Errore %s!!!!\n",e.getMessage());
		}
	}

}
