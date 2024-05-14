

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="CSS/DeleteTab.css">
<script src=''></script>
<script>


</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
 <h2>Delete Table</h2>
        <form id="deleteTableForm" action="DeleteTable" method="POST">
            <label for="tableId">Table ID:</label>
            <input type="text" id="tableId" name="tableId" required><br><br>
            <input type="submit" value="Delete Table">
        </form>
</div>
</div>
</body>
</html>



