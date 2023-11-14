<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%="Id = " + request.getParameter("id") %><br>
	<%="Name   " + request.getParameter("name") %><br>
	<%="Phone   " + request.getParameter("phone") %><br>
	<%="Address  " + request.getParameter("address") %>

</body>
</html>