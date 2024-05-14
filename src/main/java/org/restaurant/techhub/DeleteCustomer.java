package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.CustomerModel;
import restaurantService.CustomerService;
import restaurantService.CustomerServiceImpl;

/**
 * Servlet implementation class DeleteCustomer
 */
@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("hello");
		int Customerid=Integer.parseInt(request.getParameter("customer_id"));
		out.println("Id is:"+Customerid);
		CustomerModel cm=new CustomerModel();
		cm.setCustomer_id(Customerid);
		CustomerServiceImpl cs=new CustomerService();
		int res=cs.DeleteCustomer(cm);
		if(res!=-1)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewCustomer.jsp");
			r.forward(request, response);
			out.println("<h1>Customer Deleted Successfully</h1>");
		}
		else
		{
			out.println("<h1>Error in Deleting Customer</h1>");
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
