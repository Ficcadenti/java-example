package pattern.creazione.abstractfactory.ex2.interfaces;

public interface DevicesFactory
{
	public Media createMedia();

	public Player createPlayer();

	public Recorder createRecorder();
}
