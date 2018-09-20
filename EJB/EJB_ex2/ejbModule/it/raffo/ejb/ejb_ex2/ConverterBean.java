package it.raffo.ejb.ejb_ex2;

import javax.ejb.Stateless;
import it.raffo.ejb.ejb_ex2.Converter;
import it.raffo.ejb.ejb_ex2.view.ConverterBeanLocal;
import it.raffo.ejb.ejb_ex2.view.ConverterBeanRemote;

/**
 * Session Bean implementation class ConverterBean
 */
@Stateless(name = "ConverterBean", mappedName = "ConverterBean")
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
