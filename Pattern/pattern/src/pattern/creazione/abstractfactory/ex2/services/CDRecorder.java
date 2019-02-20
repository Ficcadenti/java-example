package pattern.creazione.abstractfactory.ex2.services;

import org.apache.log4j.Logger;

import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Recorder;
import pattern.creazione.abstractfactory.ex2.model.CD;

public class CDRecorder implements Recorder
{

	private static final Logger	log	= Logger.getLogger(CDRecorder.class);
	private CD					cdInside;

	@Override
	public void accept(Media med)
	{
		this.cdInside = (CD) med;
	}

	@Override
	public void record(String sound)
	{
		if (this.cdInside == null)
		{
			log.info("Error: Insert a CD.");
		}
		else
		{
			this.cdInside.saveOnCD(sound);
		}
	}

}
