package pattern.creazione.abstractfactory.ex2.views;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import pattern.creazione.abstractfactory.ex2.services.CDDevicesFactory;
import pattern.creazione.abstractfactory.ex2.services.TapeDevicesFactory;

public class AbstractFactoryExample
{
	private static final Logger log = Logger.getLogger(AbstractFactoryExample.class);

	public static void intLog4j()
	{
		Properties properties = new Properties();
		properties.setProperty("log4j.rootLogger", "TRACE,stdout,MyFile");
		properties.setProperty("log4j.rootCategory", "TRACE");
		properties.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
		properties.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.stdout.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");
		properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
		properties.setProperty("log4j.appender.MyFile.File", "my_example.log");
		properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
		properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
		properties.setProperty("log4j.appender.MyFile.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

		PropertyConfigurator.configure(properties);
	}

	public static void main(String[] args)
	{
		intLog4j();
		log.info("AbstractFactoryExample");

		Client client = new Client();

		log.info("**Testing tape devices");
		client.selectTechnology(new TapeDevicesFactory());
		client.test("I wanna hold your hand...");

		log.info("**Testing CD devices");
		client.selectTechnology(new CDDevicesFactory());
		client.test("Fly me to the moon...");

		Test test = Test.instance();
		test.info();

	}
}
