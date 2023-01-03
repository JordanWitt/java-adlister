<%--
  Created by IntelliJ IDEA.
  User: jordanwitt
  Date: 1/3/23
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="pink">
<center>
  <h1>RainBow Colors</h1>
  <h2>Choose a color to see Magic</h2>
  <form action="./display" method="GET">
    <B>Color:</B>
    <select name="color" size="2">
      <option value="Violet">Violet</option>
      <option value="Indigo">Indigo</option>
      <option value="Orange">Orange</option>
      <option value="Blue">Blue</option>
      <option value="Green">Green</option>
      <option value="Yellow">Yellow</option>
    </select>
    <br><br>
    <input type=submit value="MAGIC">
  </form>
</center>
</body>
</html>
