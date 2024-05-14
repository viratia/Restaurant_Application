package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.HotelTableModel;
import restaurantService.HotelTableService;
import restaurantService.HotelTableServiceImpl;

/**
 * Servlet implementation class UpdateTable
 */
@WebServlet("/UpdateTable")
public class UpdateTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTable() {
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
	
		int tableid=Integer.parseInt(request.getParameter("table_id"));
		int tableno=Integer.parseInt(request.getParameter("table_no"));
		out.println("Table id is:"+tableid);
		out.println("Table no is:"+tableno);
		
		RequestDispatcher r=request.getRequestDispatcher("MainDashboard.jsp");
		r.include(request, response);
		 
		out.println("<div class='main p-3'>");
		 out.println("<h2 class='text-center mt-5 mb-4'>Update Table Information</h2>");
	        out.println("<form action='FinalMachineUpdate' method='post'>");
	        out.println("<div class='mb-3'>");
//	        out.println("<label for=\"tableId\" class=\"form-label\">Table ID:</label>");
	        out.println("<input type='hidden' class='form-control' value='"+tableid+"' id='tableId' name='table_id' required>");
	        out.println("</div>");
	        out.println("<div class='mb-3'>");
	        out.println("<label for='tableNo' class='form-label'>New Table Number:</label>");
	        out.println("<input type='text' class='form-control' value='"+tableno+"'  id='tableNo' name='table_no' required>");
	        out.println("</div>");
	        out.println("<input type='submit' name='s' class='btn btn-primary' value='Update Table'>");
	        out.println("</form>");
	        out.println("</div>");
	        out.println("</div>");
	                    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


