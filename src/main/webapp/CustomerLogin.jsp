<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Login</title>
    <link rel="stylesheet" href="CSS/CustomerLogin.css">
</head>
<body>
    <form action="CustomerLogin" method="post">
        <h1>Customer Login</h1>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <input type="checkbox" id="staySignedIn" name="staySignedIn">
        <label for="staySignedIn">Stay signed in</label><br>
        <input type="submit" value="Login">
        <div class="forgot-password">
            <a href="forgot_password.jsp">Forgot Password?</a>
        </div>
        <div class="signup-link">
            <a href="signup.jsp">Don't have an account? Sign Up</a>
        </div>
    </form>
</body>
</html>