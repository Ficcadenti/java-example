package pattern.creazione.abstractfactory.ex2.services;

import pattern.creazione.abstractfactory.ex2.interfaces.DevicesFactory;
import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Player;
import pattern.creazione.abstractfactory.ex2.interfaces.Recorder;
import pattern.creazione.abstractfactory.ex2.model.Tape;

public class TapeDevicesFactory implements DevicesFactory
{

	@Override
	public Media createMedia()
	{
		return new Tape();
	}

	@Override
	public Player createPlayer()
	{
		return new TapePlayer();
	}

	@Override
	public Recorder createRecorder()
	{
		return new TapeRecorder();
	}

}
