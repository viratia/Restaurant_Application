<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="CSS/AddCust.css">
<script src=''></script>
<script>


</script>
</head>
<body>
<%@include file='MainDashboard.jsp'%>

<div class='main p-3'>
<h2>Customer Registration</h2>
<form action="Customersignup" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>
        <label for="contact">Contact:</label>
        <input type="text" id="contact" name="contact" required><br>
        <label for="lastName">User-Name:</label>
        <input type="text" id="lastName" name="username" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
       
        <input type="submit" value="Sign Up" onclick="show()">
        <div class="login-link">
            <a href="login.jsp">Already have an account? Log in</a>
        </div>
    </form>
</div>
</div>
</body>
</html>



