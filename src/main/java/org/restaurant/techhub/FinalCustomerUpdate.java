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
 * Servlet implementation class FinalCustomerUpdate
 */
@WebServlet("/FinalCustomerUpdate")
public class FinalCustomerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalCustomerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String btn=request.getParameter("s");
		if(btn!=null)
		{		
			int customerid=Integer.parseInt(request.getParameter("customer_id"));
			String customername=request.getParameter("fname");
			int customercontact=Integer.parseInt(request.getParameter("contact"));
			String customerusername=request.getParameter("username");
			String customerpassword=request.getParameter("password");
			
			
			CustomerModel cm=new CustomerModel();
			cm.setCustomer_id(customerid);
			cm.setFname(customername);
			cm.setContact(customercontact);
			cm.setusername(customerusername);
			cm.setPassword(customerpassword);
			
			CustomerServiceImpl cs = new CustomerService();
			boolean b=cs.isUpdateCustomer(cm);
			if(b)
			{
				 RequestDispatcher r=request.getRequestDispatcher("ViewCustomer.jsp");
	            	r.forward(request, response);
	            	out.println("<h1>Customer Updated Successfully</h1>");
			}
			else
			{
				out.println("Customer Not Updated");
			}
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
