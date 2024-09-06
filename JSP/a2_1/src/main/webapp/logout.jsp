<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page session="true" %>
<%
    String username = (String) session.getAttribute("username");
    Date startTime = (Date) session.getAttribute("startTime");
    Date endTime = new Date();

    if (username == null || startTime == null) {
        response.sendRedirect("index.jsp");
    }

    long duration = endTime.getTime() - startTime.getTime(); 
    long seconds = duration / 1000 % 60;
    long minutes = duration / (60 * 1000) % 60;
    long hours = duration / (60 * 60 * 1000);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
</head>
<body>
<h2>Thank You, <%= username %>!</h2>
    <p>Duration of Usage: <%= hours %> hours, <%= minutes %> minutes, <%= seconds %> seconds</p>

</body>
</html>
<%
    session.invalidate(); 
%>