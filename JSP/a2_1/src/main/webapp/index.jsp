<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main page</title>
</head>
<body>
 <h2>Enter Any Name:</h2>
    <form action="welcome.jsp" method="post">
        Name: <input type="text" name="username" required>
        <input type="submit" value="Submit">
    </form>
</body>
</html>