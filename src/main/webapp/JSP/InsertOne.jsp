<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19 0019
  Time: 下午 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<h2 align="center" colspan="7">添加信息</h2>
<form action="${pageContext.request.contextPath}/InsertOne" method="get">
    <p>姓名：</p><input name="name">
    <p>年龄：</p><input name="age">
    <p>势力：</p><input name="address">
    <p>生日：</p><input type="date" name="birthday">
    <p>修为：</p><input name="grade">
    <input type="submit" value="新增">
</form>
</body>
</html>
