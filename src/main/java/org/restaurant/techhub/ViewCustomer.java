package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.CustomerModel;
import restaurantService.CustomerService;
import restaurantService.CustomerServiceImpl;

/**
 * Servlet implementation class ViewCustomer
 */
@WebServlet("/ViewCustomer")
public class ViewCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CustomerServiceImpl cs=new CustomerService();
		List<CustomerModel> list=cs.showCustomer();
		for(CustomerModel obj:list)
		{
			out.println(obj.getCustomer_id()+"\t"+obj.getFname()+"\t"+obj.getContact()+"\t"+obj.getusername());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
