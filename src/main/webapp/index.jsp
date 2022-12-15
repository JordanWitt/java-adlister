<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<jsp:include page="partials/head.jsp"/>
    <c:if test="true">
        <h1 style="text-align: center"><a href="login.jsp">Login</a></h1>
    </c:if>
    <c:if test="false">
        <h1><a href="profile.jsp">Profile</a></h1>
    </c:if>
</body>
</html>
