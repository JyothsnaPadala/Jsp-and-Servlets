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
response.setHeader("cache-control","no-cache,no-store,must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("expires","0");
if(session.getAttribute("username")==null)
{
  response.sendRedirect("Login.jsp");
}

%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/5oH9Nr3bKfw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe><br>

<iframe width="560" height="315" src="https://www.youtube.com/embed/pNKxI6NeJD4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen>khushi title song</iframe><br>

<form action = "Logout">
<input type= "submit" value="logout">

</form>

</body>
</html>