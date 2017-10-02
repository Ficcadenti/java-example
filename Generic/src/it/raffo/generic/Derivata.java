package it.raffo.generic;

public class Derivata extends Base<String> {

	public Derivata(String element) {
		super(element);
		// TODO Auto-generated constructor stub
	}
	
	public String getElement() {
		String s=super.getElement();
		System.out.printf("Chiamata get() in Derivata<T>!!!\n");
		return s;
	}

}
