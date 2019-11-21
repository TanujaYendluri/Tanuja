<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name="Jsp Programming...";
	  out.println("Name in firstJsp is  " +name+ "<br/>");
	  session.setAttribute("name", name); 
	  out.println("<a href='second.jsp'>Second</a>");
	%>
</body>
</html>