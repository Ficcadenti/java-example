package it.raffo.generic;

public class Base<T> {

	T element;

	public Base(T element) {
		this.element = element;
	}

	public T getElement() {
		System.out.printf("Chiamata get() in Base<T>!!!\n");
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	


}
