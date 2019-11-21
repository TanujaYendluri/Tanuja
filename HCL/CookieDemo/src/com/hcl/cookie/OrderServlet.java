package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	int i=0;
	String[][] product=new String[100][4];
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		product[i][0] = request.getParameter("ID");
		product[i][1] = request.getParameter("Name");
		product[i][2] = request.getParameter("Quantity");
		product[i][3] = request.getParameter("UOM");
		for(int j=0;j<=i;j++)
		{
			out.write("PRODUCT : "+j+1+"<br/>");
			out.write("ID  : "+product[j][0]+"<br/>");
			out.write("Name: "+product[j][1]+"<br/>");
			out.write("Qty : "+product[j][2]+"<br/>");
			out.write("UOM : "+product[j][3]+"<br/>");
			out.write("***********************<br/>");
		}
		out.write("<br/><br/>");
		out.println("<a href='order.html'>New Product</a>");
		i++;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
