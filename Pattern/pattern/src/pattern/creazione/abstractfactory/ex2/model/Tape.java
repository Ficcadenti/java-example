package pattern.creazione.abstractfactory.ex2.model;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;

public class Tape implements Media
{
	private String tape = "";

	public String readTape()
	{
		return this.tape;
	}

	public void saveOnTape(String sound)
	{
		this.tape = sound;
	}
}
