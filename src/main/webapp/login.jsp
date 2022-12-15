<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bookshop Website</title>
</head>
<body>
<div style="text-align: center">
    <h1>Admin Login</h1>
    <form action="login.jsp" method="post">
        Name:<label>
        <input type="text" name="username"/>
    </label><br/>
        Password:<label>
        <input type="password" name="password"/>
    </label><br/>
        <input type="submit" value="login">
    </form>
</div>


<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println("Checking login");
    if(request.getMethod().equalsIgnoreCase("post")){
        if (username == null || password == null) {
            response.sendRedirect("/login.jsp");
        }
        // Here you put the check on the username and password
        if (username.toLowerCase().trim().equals("admin") && password.toLowerCase().trim().equals("password")) {
            response.sendRedirect("/profile.jsp");
            System.out.println("success");
        } else {
            System.out.println("Invalid username and password");
        }
    }
%>
</body>
</html>