<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<jsp:include page="partials/head.jsp"/>
<c:if test="true">
    <h1 style="text-align: center; margin-top: 50%" ><a href="pizza-order.jsp">Order Online</a></h1>
</c:if>
<c:if test="false">
    <h1><a href="pizza-order.jsp">Profile</a></h1>
</c:if>
</body>
</html>