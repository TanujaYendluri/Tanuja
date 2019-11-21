<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.beans.InventoryConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>StockID</th>
<th>ItemName</th>
<th>Price</th>
<th>Quantity</th>
</tr>
	<%
		Connection con=InventoryConnection.getConnection();
		String cmd="select * from stock";
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		int qtyAvail;
		while(rs.next()) {
		 qtyAvail=rs.getInt("quantityAvail");
		 if(qtyAvail < 10) {
	%>
	<tr bgcolor="red">
	<td><%=rs.getString("stockID") %> </td>
	<td><%=rs.getString("itemName") %> </td>
	<td><%=rs.getString("price") %> </td>
	<td><%=rs.getString("QuantityAvail") %> </td>
	</tr>
	<%
		 } else {
	
	%>
	<tr>
	<td><%=rs.getString("stockID") %> </td>
	<td><%=rs.getString("itemName") %> </td>
	<td><%=rs.getString("price") %> </td>
	<td><%=rs.getString("QuantityAvail") %> </td>
	</tr>
	<%
		 }
		}
	%>
</table>
</body>
</html>  cc