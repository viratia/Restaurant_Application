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
 * Servlet implementation class DeleteTable
 */
@WebServlet("/DeleteTable")
public class DeleteTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("hii");
		int  Tableid=Integer.parseInt(request.getParameter("table_no"));
		out.println("Id is:"+Tableid);
		HotelTableModel hm=new HotelTableModel();
		hm.setTable_id(Tableid);
		HotelTableServiceImpl hs=new HotelTableService();
//		out.println("this is"+Tableid);
		int result=hs.isDeleteTable(hm);
//		out.println("result "+result);
		if(result!=-1)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewTable.jsp");
			r.forward(request, response);
			
			out.println("<h1>Table Deleted Successfully</h1>");
		}
		else
		{
			out.println("<h1>Error In Deleting</h1>");
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
