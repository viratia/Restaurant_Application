package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.MenuModel;
import restaurantService.MenuService;
import restaurantService.MenuServiceImpl;

@WebServlet("/FinalMenuUpdate")
public class FinalMenuUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String btn=request.getParameter("s");
		if(btn!=null)
		{
			int menuid=Integer.parseInt(request.getParameter("menu_id"));
			String menuName=request.getParameter("name");
			int menuPrice=Integer.parseInt(request.getParameter("price"));
			MenuModel mm=new MenuModel();
			mm.setMenu_id(menuid);
			mm.setName(menuName);
			mm.setPrice(menuPrice);
			MenuServiceImpl ms=new MenuService();
			boolean b=ms.isUpdateMenu(mm);
			if(b)
			{
				 RequestDispatcher r=request.getRequestDispatcher("ViewMenu.jsp");
	            	r.forward(request, response);
	            	out.println("<h1>Menu Updated Successfully</h1>");
			}
			else
			{
				out.println("<h1>Menu Not Updated Successfully</h1>");
				
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
