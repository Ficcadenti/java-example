package it.raffo.annotazioni;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Annotazioni  - TEST 1");
			Base b=new Base();
			
			System.out.println("Somma="+b.somma(1,2));

			int elem[]= {7,2};
			System.out.println("Somma="+b.somma(elem));
	}

}
