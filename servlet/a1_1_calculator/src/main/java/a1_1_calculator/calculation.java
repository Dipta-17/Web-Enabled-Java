package a1_1_calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class calculation extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

       
        int result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
               
                    result = num1 / num2;
               
                break;
            default:
                PrintWriter out = res.getWriter();
                out.println("Invalid operation.");
                return;
        }

        // Sending the result back to the client
        PrintWriter out = res.getWriter();
        out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
    }
}
