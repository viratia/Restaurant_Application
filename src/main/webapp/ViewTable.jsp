
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="restaurantModel.HotelTableModel"%>
<%@ page import="java.util.List"%>
<%@page import="restaurantService.HotelTableService"%>
<%@page import="restaurantService.HotelTableServiceImpl"%>
<%@page import="restaurantModel.HotelTableModel"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="CSS/ViewTab.css">
<script src=''></script>
<script>


</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
<h2>Tables Details</h2>
		<form action="ViewTable">
			<table class="table">
				<thead>
					<tr>
						<th>Table ID</th>
						<th>Table No</th>
						<th>Table Status</th>
						<th>Delete</th>
						<th>Update</th>
					</tr>
				</thead>
				<tbody>
					<%
					HotelTableServiceImpl hs = new HotelTableService();
					List<HotelTableModel> list = hs.ShowTables();
					for (HotelTableModel obj : list) {
					%>
					<tr>
						<td><%=obj.getTable_id()%></td>
						<td><%=obj.getTable_no()%></td>
						<td><%=obj.getStauts()%></td>
						<td><a href='DeleteTable?table_no=<%=obj.getTable_id() %>'>Delete</a></td>
						<td><a href='UpdateTable?table_id=<%=obj.getTable_id() %>&table_no=<%=obj.getTable_no()%>'>Update</a></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</form>
</div>
</div>
</body>
</html>



