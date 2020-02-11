<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/18 0018
  Time: 下午 3:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查询所有</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/JQ/jquery-1.11.0.js"></script>
</head>
<body>
<div align="center">
    <form  id="myForm" action="${pageContext.request.contextPath}/SelEmpAll">
        姓名：<input type="text" name="name" size="7" value="${params.name}"/>
        年龄：<input type="text" name="ageFrom" size="7" value="${params.ageFrom}"/>
        --<input type="text" name="ageTo" size="7" value="${params.ageTo}"/>
        势力：<input type="text" name="address" size="7" value="${params.address}"/>
        生日：<input type="date" name="birthdayFrom" size="7" value="<fmt:formatDate value='${params.birthdayFrom}' pattern='yyyy-MM-dd'/>"/>
        --<input type="date" name="birthdayTo" size="7" value="<fmt:formatDate value='${params.birthdayTo}' pattern='yyyy-MM-dd'/>"/>
        修为：<input type="text" name="grade" size="7" value="${params.grade}"/>
        <input id="pn" type="hidden" name="pageNum" value="${empPageInfo.pageNum}"/>
        <input id="ps" type="hidden" name="pageSize" value="${empPageInfo.pageSize}"/>
        <input type="submit" value="搜索"/>
    </form>
</div>
<table align="center">
    <tr align="center">
        <td colspan="7" style="background-color: aqua">个人资料</td>
    </tr>
    <tr align="center">
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>势力</th>
        <th>生日</th>
        <th>修为</th>
    </tr>
    <%--可以写${empList}也可以写${empPageInfo.list}--%>
   <c:forEach items="${empList}" var="emp" varStatus="ee">
        <tr align="center">
            <%--<td>${emp.id}</td>--%>
            <td>${ee.count+(empPageInfo.pageNum-1)*empPageInfo.pageSize}</td>
            <td>${emp.name}</td>
            <td>${emp.age}</td>
            <td>${emp.address}</td>
            <td>${emp.birthday}</td>
            <td>${emp.grade}</td>
            <td>
                <a href="${pageContext.request.contextPath}/JSP/InsertOne.jsp"><input type="button" value="添加"/></a>
                <a href="${pageContext.request.contextPath}/JSP/UpdateOne.jsp"><input type="button" value="修改"/></a>
                <a href="${pageContext.request.contextPath}/DeleteOne?id=${emp.id}"><input type="button" value="删除"/></a>
            </td>
        </tr>
    </c:forEach>
    <tr align="center">
        <td colspan="7">
            <a href="javascript:topage(1);"><input type="button" value="首页"/></a>
            <a href="javascript:topage(${empPageInfo.pageNum-1});"><input type="button" value="上一页"/></a>
            第${empPageInfo.pageNum}页
            总${empPageInfo.pages}页
            设置每页<select id="pageSize" onchange="topage(1)">
                <option <c:if test="${empPageInfo.pageSize==3}">selected</c:if>>3</option>
                <option <c:if test="${empPageInfo.pageSize==5}">selected</c:if>>5</option>
                <option <c:if test="${empPageInfo.pageSize==8}">selected</c:if>>8</option>
                <option <c:if test="${empPageInfo.pageSize==10}">selected</c:if>>10</option>
            </select>
            条显示
            <a href="javascript:topage(${empPageInfo.pageNum+1});"><input type="button" value="下一页"/></a>
            <a href="javascript:topage(${empPageInfo.pages});"><input type="button" value="尾页"/></a>
        </td>
    </tr>
</table>

</body>
<script type="text/javascript">
    function topage(pageNum) {
        var pageSize = $("#pageSize").val();
        $("#ps").val(pageSize);
        $("#pn").val(pageNum);
        $("#myForm").submit();
    }
</script>
</html>
