package org.restaurant.techhub;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import restaurantModel.MenuModel;
import restaurantService.MenuService;
import restaurantService.MenuServiceImpl;

/**
 * Servlet implementation class ViewMenu
 */
@WebServlet("/ViewMenu")
public class ViewMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		MenuServiceImpl ms=new MenuService();
		List<MenuModel> list=ms.showMenu();
		for(MenuModel obj:list)
		{
			out.println(obj.getMenu_id()+"\t"+obj.getCategory()+"\t"+obj.getName()+"\t"+obj.getPrice());
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
