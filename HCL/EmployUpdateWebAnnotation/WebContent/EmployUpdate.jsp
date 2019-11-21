<%@page import="com.java.hib.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.java.hib.EmploySearch" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="com.java.hib.Employ"/>
	<jsp:setProperty property="*" name="bean1"/>
	<%
	int empno=bean1.getEmpno();
	EmploySearch obj = new EmploySearch();
	Employ e= obj.searchEmploy(empno);
	out.println("Department : "+e.getDept());
	out.println("Name : "+e.getName());
	out.println("Designation : "+e.getDesig());
	out.println("Basic : "+e.getBasic());
	%>
</body>
</html>