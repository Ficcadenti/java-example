package it.raffo.webtest;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.raffo.ejb.ejb_ex2.view.ConverterBeanLocal;

public class SessionBeanTest extends HttpServlet
{
	private static final long	serialVersionUID	= 7314316742843208149L;

	@EJB
	private ConverterBeanLocal	converterBeanLocal;

	public SessionBeanTest()
	{
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Conversion test:" + this.converterBeanLocal.celsiusToFahrenheit(30));
	}

}
