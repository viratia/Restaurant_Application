
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="CSS/AddTab.css">
<script src=''></script>
<script>


</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
 <h2>Add Table Details</h2>
    <form id="tableForm" action="AddTable" method="post">
        <div class="form-group">
            <label for="tableNumber">Table Number:</label>
            <input type="text" id="tableNumber" name="tableNumber" required>
        </div>
        <div class="form-group">
            <label for="status">Status:</label>
            <select id="status" name="status" required>
                <option value="Available">Available</option>
                <option value="Occupied">Occupied</option>
            </select>
        </div>
        <input type="submit" value="Add Table" onclick="show()">
    </form>	
</div>
</div>
</body>
</html>



