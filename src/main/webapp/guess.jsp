<%--
  Created by IntelliJ IDEA.
  User: jordanwitt
  Date: 1/4/23
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form style="display: flex; justify-content: center" method="post" action="/guess">
    <label for="number">Choose a number between 1 and 3:</label><br>
    <input type="number" id="number" name="number" min="1" max="3"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
