package it.raffo.threadlocal;

public class MyClass
{
	public String str;

	public void info()
	{
		System.out.println("MyClass::info() str=" + this.str);
	}

	public void set(String s)
	{
		this.str = s;
	}

}
