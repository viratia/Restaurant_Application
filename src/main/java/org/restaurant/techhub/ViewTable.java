package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.HotelTableModel;
import restaurantService.HotelTableService;
import restaurantService.HotelTableServiceImpl;

/**
 * Servlet implementation class ViewTable
 */
@WebServlet("/ViewTable")
public class ViewTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("hii");
		HotelTableServiceImpl hs=new HotelTableService();
		List<HotelTableModel> list=hs.ShowTables();
		for(HotelTableModel obj:list)
		{
			out.println(obj.getTable_id()+"\t"+obj.getTable_no()+"\t"+obj.getStauts());
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
