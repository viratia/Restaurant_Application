<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="restaurantModel.CustomerModel"%>
<%@ page import="java.util.List" %>
<%@page import="restaurantService.CustomerService"%>
<%@page import="restaurantService.CustomerServiceImpl"%>
<%@page import="restaurantModel.CustomerModel"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table class="table">
	
		<thead>
		
			<tr>
				<th>Customer ID</th>
				<th>Customer Name</th>
				<th>Customer Contact</th>
				<th>Customer username</th>
				<th>Delete Customer</th>
				<th>Update Customer</th>
			</tr>
		</thead>
		 <tbody>
            <% 
            String search=request.getParameter("n");
            CustomerServiceImpl cs = new CustomerService();
            List< CustomerModel> list = cs.SearchByCusomer(search);
            for ( CustomerModel obj : list) {
            %>
            <tr>
                <td><%=obj.getCustomer_id()%></td>
                <td><%=obj.getFname()%></td>
                <td><%=obj.getContact()%></td>
                <td><%=obj.getusername()%></td>
                <td><a href='DeleteCustomer?customer_id=<%=obj.getCustomer_id()%>'>Delete</a></td>
                <td><a href='UpdateCustomer?customer_id=<%=obj.getCustomer_id()%>&fname=<%=obj.getFname()%>&contact=<%=obj.getContact()%>&username=<%=obj.getusername()%>&password=<%=obj.getPassword()%>'>Update</a></td>
            </tr>
            <% 
            }
            %>
        </tbody>
	</table>
</body>
</html>