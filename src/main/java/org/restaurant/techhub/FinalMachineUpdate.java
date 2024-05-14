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
 * Servlet implementation class FinalMachineUpdate
 */
@WebServlet("/FinalMachineUpdate")
public class FinalMachineUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalMachineUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("html/text");
		 PrintWriter out=response.getWriter();
		 String btn=request.getParameter("s");
	        if(btn!=null)
	        {
	        	 int tableid=Integer.parseInt(request.getParameter("table_id"));
	             int tableno=Integer.parseInt(request.getParameter("table_no"));
	            HotelTableModel hm=new HotelTableModel();
	            hm.setTable_id(tableid);
	            hm.setTable_no(tableno);
	            HotelTableServiceImpl hs=new HotelTableService();
	            boolean result=hs.isUpdateTable(hm);
	            if(result)
	            {
      	 RequestDispatcher r=request.getRequestDispatcher("ViewTable.jsp");
	            	r.forward(request, response);
	            	out.println("<h1>Table Updated Successfully</h1>");
	            }
	            else
	            {
	            	out.println("Table Not Updated");
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
