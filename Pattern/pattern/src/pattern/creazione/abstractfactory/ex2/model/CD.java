package pattern.creazione.abstractfactory.ex2.model;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;

public class CD implements Media
{
	private String cd = "";

	public String readCD()
	{
		return this.cd;
	}

	public void saveOnCD(String sound)
	{
		this.cd = sound;
	}
}
