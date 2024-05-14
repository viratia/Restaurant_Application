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

/**
 * Servlet implementation class AddMenu
 */
@WebServlet("/AddMenu")
public class AddMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String category=request.getParameter("category");
		String name=request.getParameter("itemName");
		int price=Integer.parseInt(request.getParameter("price").toString());
		MenuModel mm=new MenuModel();
		mm.setCategory(category);
		mm.setName(name);
		mm.setPrice(price);
		MenuServiceImpl ms=new MenuService();
		int res=ms.AddMenu(mm);
		if(res!=0)
		{

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Hello</title>");
			out.println("</head>");
			out.println("<body onload='show()'>");
			out.println("<script>");
			out.println("function show()");
			out.println("{");
			out.println("alert('Menu Added Successfully')");
			out.println("window.location.href='ViewMenu.jsp'");
			out.println("}");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");	
			
//			RequestDispatcher r=request.getRequestDispatcher("ViewMenu.jsp");
//			r.forward(request, response);
		}
		else
		{
//			RequestDispatcher r=request.getRequestDispatcher("ViewMenu.jsp");
//			r.forward(request, response);
			out.println("<h1> Error in Menu Adding </h1>");
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
