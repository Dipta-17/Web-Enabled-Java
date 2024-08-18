package a1_9_refresh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AutoRefreshServlet")
public class refreshPage extends HttpServlet {
	private static final long serialVersionUID=1L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		int refreshTime=5;
		res.setIntHeader("Refresh",refreshTime);
		
		res.setContentType("text/html");
		
		PrintWriter out =res.getWriter();
		out.println("<html>");
		out.println("<head><title>Auto Refresh Servlet</title></head>");
		out.println("<body>");
		out.println("<p>Current time: " + new java.util.Date() + "</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
