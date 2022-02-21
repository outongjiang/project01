<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/1/29
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            font-size: 30px;
            font-weight: bold;
        }
    </style>
</head>
<body>

<table>
        <tr>
            <td>序号</td>
            <td>角色名字</td>
            <td>状态</td>
            <td>密码</td>
        </tr>
    <c:forEach items="${roles}" var="role" varStatus="s">
        <tr>
            <td>${s.index}</td>
            <td>${role.rolename}</td>
            <td>${role.status}</td>
            <td>${role.password}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
