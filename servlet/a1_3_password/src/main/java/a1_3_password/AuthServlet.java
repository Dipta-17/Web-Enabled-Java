package a1_3_password;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		String password=req.getParameter("password");
		String prePassword="Servlet";
		if(prePassword.equals(password)) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("welcomeServlet");
			dispatcher.forward(req, res);
		}
		else {
			PrintWriter out=res.getWriter();
			out.println("<h1>Invalid Password</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
			dispatcher.include(req, res);
			
		}
		
	}
}
