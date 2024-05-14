<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
 <link rel="stylesheet" href="CSS/AddNewAdmin.css">

</head>
<body>
    <form action="AddNewAdmin" method="post">
        <h1>Add New Admin</h1>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Add" onclick="show()">
       
    </form>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Invalid username or password!</p>
    <% } %>
</body>
</html>