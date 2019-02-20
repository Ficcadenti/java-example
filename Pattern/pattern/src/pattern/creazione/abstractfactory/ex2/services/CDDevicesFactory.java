package pattern.creazione.abstractfactory.ex2.services;

import pattern.creazione.abstractfactory.ex2.interfaces.DevicesFactory;
import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Player;
import pattern.creazione.abstractfactory.ex2.interfaces.Recorder;
import pattern.creazione.abstractfactory.ex2.model.CD;

public class CDDevicesFactory implements DevicesFactory
{

	@Override
	public Media createMedia()
	{
		return new CD();
	}

	@Override
	public Player createPlayer()
	{
		return new CDPlayer();
	}

	@Override
	public Recorder createRecorder()
	{
		return new CDRecorder();
	}

}
