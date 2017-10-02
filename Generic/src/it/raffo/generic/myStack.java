package it.raffo.generic;


public class myStack<E> {

	private final int size;
	private int top;
	private E[] elementi;

	public myStack() {
		this(5);
		// TODO Auto-generated constructor stub
	}

	public myStack(int ne) {
		size = (ne==0 ? 5 : ne);
		top=-1;
		elementi=(E[])new Object[size];
	}

	public void push(E value) throws Exception
	{
		if(top==size-1)
		{
			throw new Exception("Lo stack è pieno");
		}
		else
		{
			elementi[++top]=value;
		}
	}

	public E pop()
	{
		if(top==-1)
		{
			return null;
		}
		else
		{
			return elementi[top--];
		}
	}
	
	public int size()
	{
		return this.size;
	}
}

