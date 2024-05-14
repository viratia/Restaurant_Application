<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="restaurantModel.MenuModel"%>
<%@ page import="java.util.List" %>
<%@page import="restaurantService.MenuService"%>
<%@page import="restaurantService.MenuServiceImpl"%>
<%@page import="restaurantModel.MenuModel"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table">
	
		<thead>
		
			<tr>
				<th>Menu ID</th>
				<th>Menu Category</th>
				<th>Menu Name</th>
				<th>Menu Price</th>
				<th>Delete Menu</th>
				<th>Update Menu</th>
			</tr>
		</thead>
		 <tbody>
            <% 
            String search=request.getParameter("n");
            MenuServiceImpl cs = new MenuService();
            List< MenuModel> list=cs.searchMenu(search);
            for ( MenuModel obj : list) {
            %>
            <tr>
                <td><%=obj.getMenu_id()%></td>
                <td><%=obj.getCategory()%></td>
                <td><%=obj.getName()%></td>
                <td><%=obj.getPrice()%></td>
                <td><a href='DeleteMenu?menu_id=<%=obj.getMenu_id()%>'>Delete</a></td>
                <td><a href='UpdateMenu?menu_id=<%=obj.getMenu_id()%>&name=<%=obj.getName()%>&price=<%=obj.getPrice()%>'>Update</a></td>
           
            </tr>
            <% 
            }
            %>
        </tbody>
	</table>
</body>
</html>