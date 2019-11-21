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
		Connection con = DaoConnection.getConnection();
		String cmd = "select * from product where id = ?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(request.getParameter("id")));
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			out.println("id no : " + rs.getInt("id") + "<br/>");
			out.println("Name : " + rs.getString("name") + "<br/>");
			out.println("Price : " + rs.getInt("price") + "<br/>");
			out.println("Quantity : " + rs.getInt("quantity") + "<br/>");
			
			
	%>
	<a href = "PlaceOrder.jsp">Place Order</a>
	
	<%
		}
	%>
		
		int price = rs.getInt("price");
		session.setAttribute("price", price);
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		session.setAttribut("quantity",quantity);
</body>
</html>