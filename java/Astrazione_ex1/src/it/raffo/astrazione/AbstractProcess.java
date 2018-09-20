package it.raffo.astrazione;

public abstract class AbstractProcess
{
	public abstract void baseAction();

	public void init()
	{
		System.out.println("AbstractProcess.init()");
	}

	public void process()
	{
		System.out.println("AbstractProcess.process()");
		this.init();
		this.baseAction();
		this.stepAfter();
	}

	public void stepAfter()
	{
		System.out.println("AbstractProcess.stepAfter()");
	}
}
