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
 * Servlet implementation class UpdateMenu
 */
@WebServlet("/UpdateMenu")
public class UpdateMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("hello");
		int menuid=Integer.parseInt(request.getParameter("menu_id"));
//		out.println("id is:"+menuid);
		String menuName=request.getParameter("name");
//		out.println("name is:"+menuName);
		int menuPrice=Integer.parseInt(request.getParameter("price"));
//  	out.println("price is:"+menuPrice);
		RequestDispatcher r=request.getRequestDispatcher("MainDashboard.jsp");
		r.include(request, response);
		
		 out.println("<div class='main p-3'>");
		 out.println("<h2 class='mb-4'>Menu Form</h2>");
		 out.println("<form action='FinalMenuUpdate' method='post'>");
		 out.println("<div class='form-group'>");
  	     out.println("<label for='menu_id'>Menu Item ID:</label>");
		 out.println("<input type='hidden' class='form-control'  value='"+menuid+"' id='menu_id' name='menu_id'>");
		 out.println("</div>");
		 out.println("<div class='form-group'>");
		 out.println("<label for='name'>Name:</label>");
		 out.println("<input type='text' class='form-control' value='"+menuName+"' id='name' name='name'>");
		 out.println("</div>");
		 out.println("<div class='form-group'>");
		 out.println("<label for='price'>Price:</label>");
		 out.println("<input type='text' class='form-control' value='"+menuPrice+"' id='price' name='price'>");
		 out.println("</div>");
		 out.println("<input type='submit' name='s' class='btn btn-primary' value='Update Menu'>");
		 out.println("</form>");
	     out.println("</div>");
	     out.println("</div>");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
