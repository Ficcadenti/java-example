package pattern.creazione.abstractfactory.ex2.services;

import org.apache.log4j.Logger;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Recorder;
import pattern.creazione.abstractfactory.ex2.model.Tape;

public class TapeRecorder implements Recorder
{

	private static final Logger	log	= Logger.getLogger(TapeRecorder.class);
	private Tape				tapeInside;

	@Override
	public void accept(Media med)
	{
		this.tapeInside = (Tape) med;
	}

	@Override
	public void record(String sound)
	{
		if (this.tapeInside == null)
		{
			log.info("Error: Insert a tape.");
		}
		else
		{
			this.tapeInside.saveOnTape(sound);
		}
	}

}
