
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
    <link rel="stylesheet" href="CSS/ViewMenu.css">
<script>
function searchByName(){
	var n=document.getElementById("search").value;
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		//console.log("hii");
		 if(this.readyState == 4 && this.status == 200){
			 
			 document.getElementById("d").innerHTML=this.responseText;
		 }
	};
	xhttp.open("GET","SearchByName.jsp?n="+n,true)
	xhttp.send();
}

</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
 <h2>Menu Details</h2>
 <div style="text-align:right">

 <input type='search' name='name' id='search' value='' style='width:150px;height:30px;' onkeyup="searchByName()"/>
 <button type="button" style="display: inline-block; font-size: 16px;">&#128269;</button>
</div>
<form action="ViewMenu">
<div id="d">
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
            MenuServiceImpl cs = new MenuService();
            List< MenuModel> list = cs.showMenu();
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
	</div>
	</form>
</div>
</div>
</body>
</html>



