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

@WebServlet("/DeleteMenu")
public class DeleteMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("hello");
		int menuid=Integer.parseInt(request.getParameter("menu_id"));
		out.println("MenuId is:"+menuid);
		MenuModel mm=new MenuModel();
		mm.setMenu_id(menuid);
		MenuServiceImpl ms=new MenuService();
		int result=ms.isDeleteMenu(mm);
		if(result!=-1)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewMenu.jsp");
			r.forward(request, response);
			out.println("<h1>Menu Deleted Successfully</h1>");
		}
		else
		{
			out.println("<h1>Menu Not Deleted Successfully</h1>");
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
