<%--
  Created by IntelliJ IDEA.
  User: CHAM
  Date: 7/13/2020
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"import="java.util.*"
         contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<%
  String message=(String)session.getAttribute("message");
%>
<form action="Servlet"method="post">
  <input type = "submit"value="Roll the game">
</form>
</body>
</html>
