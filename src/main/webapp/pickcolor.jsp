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
<div style="text-align: center;">
  <h1>RainBow Colors</h1>
  <h2>Choose a color to see Magic</h2>
  <form action="/pickColor" method="post">
    <label>
      <select name="Color" size="2">
        <option name="Color" value="Violet">Violet</option>
        <option name="Color" value="Indigo">Indigo</option>
        <option name="Color" value="Orange">Orange</option>
        <option name="Color" value="Blue">Blue</option>
        <option name="Color" value="Green">Green</option>
        <option name="Color" value="Yellow">Yellow</option>
      </select>
    </label>
    <br><br>
    <input type=submit value="MAGIC">
  </form>
</div>
</body>
</html>