package it.raffo.ejb;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import it.raffo.ejb.view.ConverterBeanLocal;
import it.raffo.ejb.view.ConverterBeanRemote;

/**
 * Session Bean implementation class ConverterBean
 */
@Stateless
@Local(ConverterBeanLocal.class)
@Remote(ConverterBeanRemote.class)
@LocalBean
public class ConverterBean implements ConverterBeanRemote, ConverterBeanLocal
{

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

}
