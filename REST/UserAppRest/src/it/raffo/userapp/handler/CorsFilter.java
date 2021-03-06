package it.raffo.userapp.handler;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebFilter("/*")
public class CorsFilter implements Filter
{
	private static final Logger log = Logger.getLogger(CorsFilter.class);

	@Override
	public void destroy()
	{
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException
	{
		log.info("Partito il filtro");
		if (response instanceof HttpServletResponse)
		{
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;

			String requestURI = httpServletRequest.getRequestURI();
			log.info(requestURI);

			if (requestURI.contains("usermod") || requestURI.contains("useradd") || requestURI.contains("userdel"))
			{
				log.info("Applico CORS !!!!");
				HttpServletResponse httpServletResponse = (HttpServletResponse) response;
				httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
				httpServletResponse.addHeader("Access-Control-Allow-Headers", "content-type");
				httpServletResponse.addHeader("Access-Control-Allow-Methods", "POST, PUT, DELETE");
				filterChain.doFilter(request, httpServletResponse);
			}
			else
			{
				filterChain.doFilter(request, response);
			}
		}
		else
		{
			filterChain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
		// TODO Auto-generated method stub

	}

}
