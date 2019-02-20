package it.raffo.threadlocal.ex2;

import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ThreadLocalEx2 implements Runnable
{
	private static final Logger							log			= Logger.getLogger(ThreadLocalEx2.class);
	private static final ThreadLocal<SimpleDateFormat>	formatter	= new ThreadLocal<SimpleDateFormat>()
																	{
																		@Override
																		protected SimpleDateFormat initialValue()
																		{
																			return new SimpleDateFormat(
																					"yyyyMMdd HHmm");
																		}
																	};

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
		properties.setProperty("log4j.appender.MyFile.File", "threadlocal.log");
		properties.setProperty("log4j.appender.MyFile.MaxFileSize", "100KB");
		properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "1");
		properties.setProperty("log4j.appender.MyFile.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

		PropertyConfigurator.configure(properties);
	}

	public static void main(String[] args) throws InterruptedException
	{
		intLog4j();
		log.info("ThreadLocalEx2");

		ThreadLocalEx2 obj = new ThreadLocalEx2();
		for (int i = 0; i < 10; i++)
		{
			Thread t = new Thread(obj, "" + i);
			int sleep = new Random().nextInt(1000);
			Thread.sleep(sleep);
			t.start();
		}
	}

	@Override
	public void run()
	{
		log.info("Thread Name = " + Thread.currentThread().getName() + " default Formatter = "
				+ formatter.get().toPattern());
		try
		{
			Thread.sleep(new Random().nextInt(1000));
		}
		catch (InterruptedException e)
		{
			log.error(e.getMessage(), e);
		}
		formatter.set(new SimpleDateFormat());

		log.info("Thread Name = " + Thread.currentThread().getName() + " formatter = " + formatter.get().toPattern()
				+ "\n");
	}

}
