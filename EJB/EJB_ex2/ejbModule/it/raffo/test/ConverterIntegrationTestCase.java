package it.raffo.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import it.raffo.ejb.ejb_ex2.view.ConverterBeanRemote;
import junit.framework.TestCase;

public class ConverterIntegrationTestCase
{

	private static Context				namingContext;
	private static ConverterBeanRemote	ejb30Remote;
	private static final String			REMOTE_JNDI_NAME	= "/EJb_ex2EAR/EJb_ex2/ConverterBean!it.raffo.ejb.ejb_ex2.ConverterBeanRemote";

	@BeforeClass
	public static void obtainProxyReferences() throws NamingException
	{
		Properties jndiProperties = new Properties();
		jndiProperties.put("jboss.naming.client.ejb.context", true);
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		namingContext = new InitialContext(jndiProperties);
	}

	@AfterClass
	public static void tearDownClass() throws NamingException
	{
		namingContext.close();
	}

	@Test
	public void testConverter() throws NamingException
	{
		ejb30Remote = (ConverterBeanRemote) namingContext.lookup(REMOTE_JNDI_NAME);
		TestCase.assertEquals(ejb30Remote.celsiusToFahrenheit(30.0f), 86.0f);
		TestCase.assertEquals(ejb30Remote.fahrenheitToCelsius(86.0f), 30.0f);
	}
}
