package pattern.creazione.abstractfactory.ex2.views;

import org.apache.log4j.Logger;

import pattern.creazione.abstractfactory.ex2.interfaces.DevicesFactory;
import pattern.creazione.abstractfactory.ex2.interfaces.Media;
import pattern.creazione.abstractfactory.ex2.interfaces.Player;
import pattern.creazione.abstractfactory.ex2.interfaces.Recorder;

public class Client
{
	private static final Logger	log	= Logger.getLogger(Client.class);
	private DevicesFactory		technology;

	public void selectTechnology(DevicesFactory df)
	{
		this.technology = df;
	}

	public void test(String song)
	{
		Media media = this.technology.createMedia();
		Recorder recorder = this.technology.createRecorder();
		Player player = this.technology.createPlayer();

		recorder.accept(media);
		log.info("Recording the song : " + song);
		recorder.record(song);
		log.info("Listening the record:");
		player.accept(media);
		player.play();
	}
}
