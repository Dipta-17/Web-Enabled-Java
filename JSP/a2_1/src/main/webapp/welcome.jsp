<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page session="true" %>
<%
    String username = request.getParameter("username");
    if (username == null || username.trim().isEmpty()) {
        response.sendRedirect("index.jsp");
    }

    session.setAttribute("username", username);
    Date startTime = new Date();
    session.setAttribute("startTime", startTime);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<title>Welcome Page</title>
    <style>
        .top-right {
            position: absolute;
            top: 10px;
            right: 10px;
        }
    </style>
<body>
<div class="top-right">
        <%
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            out.print("Start Time: " + sdf.format(startTime));
        %>
    </div>
    <h2>Hello, <%= session.getAttribute("username") %>!</h2>
    <form action="logout.jsp" method="post">
        <input type="submit" value="Logout">
    </form>

</body>
</html>