package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.CustomerModel;
import restaurantService.CustomerService;
import restaurantService.CustomerServiceImpl;

import java.sql.*;
import java.util.*;
/**
 * Servlet implementation class Customersignup
 */
@WebServlet("/Customersignup")
public class Customersignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customersignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
				String fname=request.getParameter("firstName");
				int Ccontact=Integer.parseInt(request.getParameter("contact").toString());
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				CustomerModel cm=new CustomerModel();
				cm.setFname(fname);
				cm.setContact(Ccontact);
				cm.setusername(username);
				cm.setPassword(password);
				CustomerServiceImpl cs= new CustomerService();
				int res=cs.isAddCustomer(cm);
				if(res!=-1 )
				{
					out.println("<html>");
					out.println("<head>");
					out.println("<title>Hello</title>");
					out.println("</head>");
					out.println("<body onload='show()'>");
					out.println("<script>");
					out.println("function show()");
					out.println("{");
					out.println("alert('Table Added Successfully')");
					out.println("window.location.href='ViewCustomer.jsp'");
					out.println("}");
					out.println("</script>");
					out.println("</body>");
					out.println("</html>");	
				}
				else
				{
					out.println("<h1>Error</h1>");
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
