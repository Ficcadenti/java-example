package pattern.creazione.abstractfactory.ex2.services;

import org.apache.log4j.Logger;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Player;
import pattern.creazione.abstractfactory.ex2.model.CD;

public class CDPlayer implements Player
{
	private static final Logger	log	= Logger.getLogger(CDPlayer.class);
	private CD					cdInside;

	@Override
	public void accept(Media med)
	{
		this.cdInside = (CD) med;
	}

	@Override
	public void play()
	{
		if (this.cdInside == null)
		{
			log.info("Error: Insert a CD.");
		}
		else
		{
			log.info(this.cdInside.readCD());
		}
	}

}
