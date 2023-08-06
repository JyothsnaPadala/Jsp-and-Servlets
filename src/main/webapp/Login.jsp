<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action =Login method=post>
Enter username <input type="text" name="name"><br>
Enter password <input type="password" name ="pass"><br>
<%
response.setHeader("cache-control","no-cache,no-store,must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("expires","0");
   %>
   <% 
   if(session.getAttribute("isUserValid")=="false")
    {
    %>
   <h4>invalid credentials</h4> 
 <% 
  session.removeAttribute("isUserValid");
    }
%>
    
<input type="submit" value="login">

</form>

</body>
</html>