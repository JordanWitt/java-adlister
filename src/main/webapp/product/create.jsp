<%--
  Created by IntelliJ IDEA.
  User: jordanwitt
  Date: 1/4/23
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create A Product</title>
</head>
<body>
<h1>Create A Product</h1>
<form action="/products/create" method="post">
    <label for="name">Name</label>
    <input name="name" id="name" type="text">
    <br />
    <label for="price">Price</label>
    <input name="price" id="price" type="text">
    <br />
    <input type="submit">
</form>
</body>
</html>
