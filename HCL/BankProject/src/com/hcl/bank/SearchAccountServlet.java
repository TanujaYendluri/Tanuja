package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountServlet
 */
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo=Integer.parseInt(request.getParameter("accountNo"));
		Accounts objAccounts=AccountBAL.searchAccountBal(accountNo);
		PrintWriter out=response.getWriter();
		RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		if(objAccounts!=null) {
			out.println("First Name  " +objAccounts.getFirstName() + "<br/>");
			out.println("Last Name  " +objAccounts.getLastName() + "<br/>");
			out.println("City  " +objAccounts.getCity() + "<br/>");
			out.println("State  " +objAccounts.getState() + "<br/>");
			out.println("Amount  " +objAccounts.getAmount() + "<br/>");
			out.println("Cheq facil  " +objAccounts.getCheqFacil() + "<br/>");
			out.println("Account Type  " +objAccounts.getAccountType() + "<br/>");
		} else {
			out.println("*** Account No Not Found ***");
		}
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
