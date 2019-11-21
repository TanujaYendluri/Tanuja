package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String[] hobbies = request.getParameterValues("hobbies");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		
		out.println("Employee ID : "+id+"<br/>");
		out.println("Employee Name : "+name+"<br/>");
		out.println("Hobbies : <br/>");
		for(String s : hobbies)
		{
			out.println("&nbsp&nbsp-&nbsp"+s+"<br/>");
		}
		out.println("Gender : "+gender+"<br/>");
		out.println("City : "+city+"<br/>");
		out.println("State : "+state+"<br/>");
		out.println("Country : "+country+"<br/>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
