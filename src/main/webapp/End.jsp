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
response.setHeader("cache-control","no-cache, no-store,must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("expires","0");
%>

You are Logged out.....
you can go now :)

<form action ="Login.jsp">

<input type= "submit" value="login">
</form>


   

</body>

</html>