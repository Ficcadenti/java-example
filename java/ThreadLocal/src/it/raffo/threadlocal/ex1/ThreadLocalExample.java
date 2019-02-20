package it.raffo.threadlocal.ex1;

public class ThreadLocalExample
{
	public static class MyRunnable implements Runnable
	{

		private static final int			THREAD_SLEEP	= 2000;

		private static ThreadLocal<MyClass>	threadLocal		= new ThreadLocal<MyClass>()
															{

																@Override
																protected MyClass initialValue()
																{
																	MyClass myClass = new MyClass();
																	myClass.set("Numero casuale: ["
																			+ Thread.currentThread().getName()
																			+ "] rondom int="
																			+ (int) (Math.random() * 100D));
																	return myClass;
																}
															};

		@Override
		public void run()
		{

			while (true)
			{
				MyRunnable.threadLocal.get().info();
				try
				{
					Thread.sleep(THREAD_SLEEP);
				}
				catch (InterruptedException e)
				{
				}
			}

		}
	}

	public static void main(String[] args)
	{
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance, "thread 1");
		Thread thread2 = new Thread(sharedRunnableInstance, "thread 2");

		thread1.start();
		thread2.start();

		try
		{
			thread1.join();
			thread2.join(); // wait for thread 2 to terminate
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // wait for thread 1 to terminate

	}
}
