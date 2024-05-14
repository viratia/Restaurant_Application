
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
    <link rel="stylesheet" href="CSS/ViewCust.css">
<script src=''></script>
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
	xhttp.open("GET","SearchByCustomer.jsp?n="+n,true)
	xhttp.send();
}
</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
<h2>Customer's List</h2>
<div style="text-align:right">

 <input type='search' name='name' id='search' value='' style='width:150px;height:30px;' onkeyup="searchByName()"/>
 <button type="button" style="display: inline-block; font-size: 16px;">&#128269;</button>
</div>
<form action="ViewCustomer">
<div id="d">
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
            CustomerServiceImpl cs = new CustomerService();
            List< CustomerModel> list = cs.showCustomer();
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
	</div>
	</form>
</div>
</div>
</body>
</html>




