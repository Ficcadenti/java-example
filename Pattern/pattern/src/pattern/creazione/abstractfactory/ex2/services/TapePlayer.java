package pattern.creazione.abstractfactory.ex2.services;

import org.apache.log4j.Logger;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Player;
import pattern.creazione.abstractfactory.ex2.model.Tape;

public class TapePlayer implements Player
{
	private static final Logger	log	= Logger.getLogger(TapePlayer.class);
	private Tape				tapeInside;

	@Override
	public void accept(Media med)
	{
		this.tapeInside = (Tape) med;
	}

	@Override
	public void play()
	{
		if (this.tapeInside == null)
		{
			log.info("Error: Insert a tape.");
		}
		else
		{
			log.info(this.tapeInside.readTape());
		}
	}

}
