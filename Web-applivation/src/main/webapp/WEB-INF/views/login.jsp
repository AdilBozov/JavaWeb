<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo !!!!!!!!! From JSP</title>
</head>
<body>
<p><font color="red">${error}</font></p>
	<!-- My First name is ${name} -->
	<form action="/login.do" method="post">
	Enter your name<input type="text" name="name">
	and your password<input type="text" name="pass">
	<input type="submit" value="Login">
	</form>
</body>
</html>