package test.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "Questa è la prma servlet", urlPatterns = { "/HelloServlet" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String strName=(String)request.getParameter("userName");
		HttpSession sessione=request.getSession();
		ServletContext ctx=request.getServletContext();
		
		if(strName!=null && strName!="")
		{
			request.setAttribute("userName", strName);
			sessione.setAttribute("userName", strName);
			ctx.setAttribute("userName", strName);
		}

		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HelloServlet</title>");
		out.println("<link rel='icon' href='favicon.jpg'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Served AT: ");
		out.println(request.getContextPath());
		
		out.println("</br>User Name (request): "+request.getAttribute("userName"));
		out.println("</br>User Name (sessione): "+sessione.getAttribute("userName"));
		out.println("</br>User Name (context): "+ctx.getAttribute("userName"));
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
