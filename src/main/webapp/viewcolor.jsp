
<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/16/22
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .marquee{
        height: 50px;
        overflow: hidden;
        position: relative;
        background: #fefefe;
        color: #de52b3;
        border: 1px solid rgba(248, 46, 253, 0.73);
    }
    .marquee h1{
        position: absolute;
        width: 100%;
        height: 100%;
        margin: 0;
        line-height: 50px;
        text-align: center;
        -moz-transform: translateX(100%);
        -webkit-transform: translateX(100%);
        transform: translateX(100%);
        -moz-animation: scroll-left 2s linear infinite;
        -webkit-animation: scroll-left 2s linear infinite;
        animation: scroll-left 14s linear infinite;
    }
    @-moz-keyframes scroll-left {
        0% {
            -moz-transform: translateX(100%);
        }
        100% {
            -moz-transform: translateX(-100%);
        }
    }

    @-webkit-keyframes scroll-left {
        0% {
            -webkit-transform: translateX(100%);
        }
        100% {
            -webkit-transform: translateX(-100%);
        }
    }

    @keyframes scroll-left {
        0% {
            -moz-transform: translateX(100%);
            -webkit-transform: translateX(100%);
            transform: translateX(100%);
        }
        100% {
            -moz-transform: translateX(-100%);
            -webkit-transform: translateX(-100%);
            transform: translateX(-100%);
        }
    }
</style>
<body style="background-color: ${Color}">
<div class="marquee">
    <h1>ALL THE COLORS</h1>
</div>
</body>
</html>