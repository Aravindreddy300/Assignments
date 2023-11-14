<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String s = request.getParameter("username");
	String p = request.getParameter("password");
	if (s.equals("Aravind"))
		out.print("valid username : " + s);
	else
		out.print("Not valid username : " + s);
	%>
</body>
</html>