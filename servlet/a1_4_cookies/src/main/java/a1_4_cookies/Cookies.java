package a1_4_cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class Cookies extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        int Count = 0;
        boolean isNewVisitor = true;
        
    
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Count")) {
                    Count = Integer.parseInt(cookie.getValue());
                    isNewVisitor = false;
                    break;
                }
            }
        }
        
   
        Count++;
        
      
        Cookie visitCookie = new Cookie("Count", Integer.toString(Count));
        visitCookie.setMaxAge(60 * 60 * 24 * 365); 
        res.addCookie(visitCookie);
        
       
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        
        if (isNewVisitor) {
            out.println("<h1>Welcome, first-time visitor!</h1>");
        } else {
            out.println("<h1>Welcome back!</h1>");
            out.println("<p>You have visited this page " + Count + " times.</p>");
        }
        
        out.print("</body></html>");
    }
}

