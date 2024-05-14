package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateCustomer
 */
@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int customerid=Integer.parseInt(request.getParameter("customer_id"));
		String customername=request.getParameter("fname");
		int customercontact=Integer.parseInt(request.getParameter("contact"));
		String customerusername=request.getParameter("username");
		String customerpassword=request.getParameter("password");
//		out.println("id is:"+customerid);
//		out.println("name is:"+customername);
//		out.println("contact is:"+customercontact);
//		out.println("username is:"+customerusername);
//		out.println("pass is:"+customerpassword);
//		
		RequestDispatcher r=request.getRequestDispatcher("MainDashboard.jsp");
		r.include(request, response);
		  
		out.println("<div class='main p-3'>");
		out.println("<h2 class='text-center mt-5 mb-4'>Update Customer Information</h2>");
		out.println("<form action='FinalCustomerUpdate' method='post'>");
		out.println("<div class='form-group'>");
//		out.println("<label for='customerId'>Customer ID:</label>");
		out.println("<input type='hidden' class='form-control' value='"+customerid+"' id='customerId' name='customer_id' required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='firstName'>First Name:</label>");
		out.println("<input type='text' class='form-control' value='"+customername+"' id='firstName' name='fname' required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='contact'>Contact:</label>");
		out.println("<input type='text' class='form-control' value='"+customercontact+"' id='contact' name='contact' required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='username'>Username:</label>");
		out.println("<input type='text' class='form-control' value='"+customerusername+"' id='username' name='username' required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='password'>Password:</label>");
		out.println("<input type='password' class='form-control' value='"+customerpassword+"' id='password' name='password' required>");
		out.println("</div>");
		out.println("<input type='submit' name='s' class='btn btn-primary'/>");
		out.println("</form>");
		out.println("</div>");
        out.println("</div>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
