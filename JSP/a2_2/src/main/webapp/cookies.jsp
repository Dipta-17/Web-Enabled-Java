<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Click the button below to display all cookies stored in your browser:</h2>
    <form action="cookies.jsp" method="post">
        <input type="submit" name="action" value="List Cookies">
    </form>

<%
    String action = request.getParameter("action");

    if ("List Cookies".equals(action)) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0) {
            out.println("<h3>Cookies Stored in Your Browser:</h3>");
            out.println("<ul>");
            for (Cookie cookie : cookies) {
                out.println("<li><strong>Name:</strong> " + cookie.getName() + 
                            ", <strong>Value:</strong> " + cookie.getValue() + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No cookies found in your browser.</p>");
        }
    }
%>

</body>
</html>