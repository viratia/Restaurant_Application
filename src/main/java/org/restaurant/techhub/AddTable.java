package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantService.HotelTableService;
import restaurantService.HotelTableServiceImpl;
import restaurantModel.HotelTableModel;

/**
 * Servlet implementation class AddTable
 */
@WebServlet("/AddTable")
public class AddTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTable() {
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
//		out.println("hii");
		int Tnumber=Integer.parseInt(request.getParameter("tableNumber").toString());
		String Tstatus=request.getParameter("status");
		HotelTableModel hm=new HotelTableModel();
		hm.setTable_no(Tnumber);
		hm.setStauts(Tstatus);
		HotelTableServiceImpl hs=new HotelTableService();
		int result=hs.isAddTable(hm);
		if( result!=-1 && result!=0)
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
			out.println("window.location.href='ViewTable.jsp'");
			out.println("}");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");	
		}
		else
		{
			out.println("<h1>Error In Adding Table</h1>");
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
