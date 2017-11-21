package it.raffo.filter.webappfilter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 	Raffaele Ficcadenti
 * 			raffaele.ficcadenti@gmail.com
 */
public class WebAppFilter implements Filter {

	private ServletContext 	context;
	private String 			log_file_name = "";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("WebAppFilter: started");
		this.context = filterConfig.getServletContext();
		log_file_name = filterConfig.getInitParameter("logfile");

		System.out.println("WebAppFilter: log_file_name = "+log_file_name);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("WebAppFilter: in action");
		String log   = "";
		String name  = "";
		String value = "";
		HttpServletRequest req = (HttpServletRequest) request;
		Enumeration<String> params = req.getParameterNames();
		Cookie[] cookies = req.getCookies();

		while(params.hasMoreElements())
		{
			name = params.nextElement();
			value = request.getParameter(name);
			log += "\r\n Parametro: ["+ name + "] = " + value;
		}

		if(cookies != null)
		{
			for(Cookie cookie : cookies)
			{
				log += "\r\n Cookie: ["+ cookie.getName() + "] = "  +cookie.getValue();
			}
		}

		chain.doFilter(request, response);
		this.sendOut(log);
	}

	@Override
	public void destroy() {

	}


	public void sendOut(String log) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(log_file_name, true)));
			out.println(log);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
