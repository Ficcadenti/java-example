package it.raffo.ejb;

import java.util.concurrent.Future;

public interface Converter
{
	float celsiusToFahrenheit(float temperature);

	float fahrenheitToCelsius(float temperature);

	Future<String> processoAsincrono();

	public void testTransazione();
}
