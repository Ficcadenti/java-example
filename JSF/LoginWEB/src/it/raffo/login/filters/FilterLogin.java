package it.raffo.login.filters;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import it.raffo.login.views.beans.WelcomeBean;

/**
 * Servlet Filter implementation class FilterLogin
 */
@WebFilter("/pages/*")
public class FilterLogin implements Filter
{
	private static final Logger	log	= Logger.getLogger(FilterLogin.class);

	@Inject
	private WelcomeBean			welcomeBean;

	/**
	 * Default constructor.
	 */
	public FilterLogin()
	{
		// TODO Auto-generated constructor stub
		log.info("FilterLogin::FilterLogin()");
	}

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException
	{
		log.info("FilterLogin::doFilter()");

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession(false);
		String indexURI = request.getContextPath() + "/pages/index.xhtml";
		String errorURI = request.getContextPath() + "/pages_error/error.xhtml";
		String requestUrl = request.getRequestURL().toString();

		log.info("FilterLogin::doFilter() indexURI=" + indexURI);
		log.info("FilterLogin::doFilter() errorURI=" + errorURI);
		log.info("FilterLogin::doFilter() requestUrl=" + requestUrl);

		if ((this.welcomeBean != null) && (this.welcomeBean.isLogged()))
		{
			log.info("Utente loggato !!!!");
		}
		else
		{
			response.sendRedirect(errorURI);
		}

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException
	{
		log.info("FilterLogin::init()");
		// TODO Auto-generated method stub
	}

}
