<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.io.*" %>
<%@ page session="false" %>

<%
    String username = request.getParameter("username");
    String ageStr = request.getParameter("age");
    int age = 0;
    boolean hasSubmitted = username != null && ageStr != null;

    if (hasSubmitted) {
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            age = -1; 
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (!hasSubmitted) { %>
    <h2>Enter your name and age:</h2>
    <form action="userauthorization.jsp" method="post">
        Name: <input type="text" name="username" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Submit">
    </form>
<% } else if (age <= -1) { %>
    <h2>Invalid , try again.</h2>
<% } else if (age < 18) { %>
    <h2>Hello <%= username %>, you are not authorized to visit the site.</h2>
<% } else { %>
    <h2>Welcome <%= username %> to this site.</h2>
<% } %>
</body>
</html>