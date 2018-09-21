package it.raffo.ejb;

import java.util.concurrent.Future;

import javax.annotation.Resource;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import it.raffo.ejb.view.ConverterBeanLocal;
import it.raffo.ejb.view.ConverterBeanRemote;

/**
 * Session Bean implementation class ConverterBean
 */
@Stateless
@Local(ConverterBeanLocal.class)
@Remote(ConverterBeanRemote.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@LocalBean
public class ConverterBean implements ConverterBeanRemote, ConverterBeanLocal
{

	@Resource
	private UserTransaction usertransaction;

	/**
	 * Default constructor.
	 */
	public ConverterBean()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public float celsiusToFahrenheit(float temperature)
	{
		return (temperature * 1.8f) + 32;
	}

	@Override
	public float fahrenheitToCelsius(float temperature)
	{
		return (temperature - 32) / 1.8f;
	}

	private void metodo1()
	{
		// TODO Auto-generated method stub

	}

	private void metodo2()
	{
		// TODO Auto-generated method stub

	}

	@Override
	@Asynchronous
	public Future<String> processoAsincrono()
	{
		String status = "Finito";
		for (int i = 1; i <= 10; i++)
		{
			try
			{
				System.out.println(i + "...");
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return new AsyncResult<String>(status);

	}

	@Override
	public void testTransazione()
	{
		try
		{
			this.usertransaction.begin();
			this.metodo1();
			this.metodo2();
			this.usertransaction.commit();
		}
		catch (Exception ecc)
		{
			try
			{
				this.usertransaction.rollback();
			}
			catch (IllegalStateException | SecurityException | SystemException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
