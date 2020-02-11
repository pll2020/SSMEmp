<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19 0019
  Time: 下午 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UpdateOne" method="get">
    <input type="hidden" name="id" value="${empone.id}">
    <p>姓名：</p><input name="name" value="${empone.name}">
    <p>年龄：</p><input name="age" value="${empone.age}">
    <p>势力：</p><input name="address" value="${empone.address}">
    <p>生日：</p><input name="birthday" value="${empone.birthday}">
    <p>修为：</p><input name="grade" value="${empone.grade}">
    <input type="submit" value="修改">
</form>
</body>
</html>
