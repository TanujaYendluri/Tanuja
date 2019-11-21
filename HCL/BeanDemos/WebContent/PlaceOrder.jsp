<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.fool {
	background-color : red;
	
	width : 100%;
	left : 0;
	right : 0;
	bottom: 0;
	
	position : fixed;
	

	text-align : center;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		
	
	
	   int price = (int)session.getAttribute("price");
	   int quantity = (int)session.getAttribute("quantity");
		int totalprice = quantity * price;
		out.println("Total Price : " + totalprice);
	%>
	
<div class="fool">  
<p> Thank You Visit Again </p>  
</div>
</body>
</html>