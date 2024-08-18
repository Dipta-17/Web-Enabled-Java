package a1_7_dateandtime;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurrentDateTime")
public class CurrentDateTime extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		Date now =new Date();
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Current Date and Time</h1>");
		out.println("<p>The Current Date and Time is :"+ now + "</p>");
		out.println("<a href='CurrentDateTime'><button>Click here</button></a>");
		out.println("</body></html>");
		
	}
}
