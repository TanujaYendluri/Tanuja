<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployInsert.jsp">
		<center>
			Employ No : 
		<input type="text" name="empno" /> <br/><br/> 
			Employ Name : 
		<input type="text" name="name" /> <br/><br/> 
			Department : 
		<input type="text" name="dept" /> <br/><br/>
			Designation : 
		<input type="text" name="desig" /> <br/><br/> 
			Basic : 
		<input type="text" name="basic" /> <br/><br/> 
		<input type="submit" value="Insert" />
		</center>
	</form>
	<%
		if(request.getParameter("empno") !=null && 
			request.getParameter("basic") != null) {
			String cmd="insert into Employ values(?,?,?,?,?)";
	int empno=Integer.parseInt(request.getParameter("empno"));
	String name=request.getParameter("name");
	String dept=request.getParameter("dept"); 
	String desig=request.getParameter("desig");
	int basic=Integer.parseInt(request.getParameter("basic"));
	Connection con=DaoConnection.getConnection();
	PreparedStatement pst=con.prepareStatement(cmd); 
	pst.setInt(1, empno);
	pst.setString(2, name);
	pst.setString(3, dept);
	pst.setString(4, desig);
	pst.setInt(5, basic);
	pst.executeUpdate();
	out.println("*** record inserted ***");
		}
	%>
</body>
</html>