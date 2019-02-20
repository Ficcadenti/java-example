package pattern.creazione.abstractfactory.ex2.views;

import org.apache.log4j.Logger;

public class Test
{
	private static final Logger			log				= Logger.getLogger(Test.class);

	private static ThreadLocal<Test>	THREAD_LOCAL	= new ThreadLocal<Test>()
														{
															@Override
															protected Test initialValue()
															{
																return new Test();
															}
														};

	public static Test instance()
	{
		return THREAD_LOCAL.get();
	}

	private int i;

	public void info()
	{
		instance().i = 10;
		log.info("i = " + this.i);

	}
}
