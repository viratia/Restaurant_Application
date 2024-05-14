package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.Adminmodel;
import restaurantService.Adminservice;
import restaurantService.AdminserviceImpl;

/**
 * Servlet implementation class AddNewAdmin
 */
@WebServlet("/AddNewAdmin")
public class AddNewAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Login");
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		Adminmodel model=new Adminmodel();
		model.setUsername(Username);
		model.setPass(Password);
		AdminserviceImpl As=new Adminservice();
		int result=As.AddNewAdmin(model);
		if(result!=0)
		{
			out.println("<h1>Admin Added Succesfully<h1>");
		}
		else
		{
			out.println("<h1>Admin Not Added Succesfully<h1>");
			out.println("There is some Erroe");
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
