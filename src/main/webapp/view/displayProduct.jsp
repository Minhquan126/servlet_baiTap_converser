<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/1/2023
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product input</h1>
<form action="ServletProduct" method="post">
    <input type="text" name="description"/>
    <input type="text" name="price"/>
    <input type="text" name="percent"/>
    <a href="/ServletProduct?action=result&discount=${discount}">calculator discount</a>
</form>

</body>
</html>
