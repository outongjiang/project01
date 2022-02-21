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
    <script src="plug/js/jquery-3.2.1.min.js"></script>
    <script>
        // $(function () {
        //     setInterval(function () {
        //         send();
        //     },1000)
        // })
        function send() {
            $.ajax({
                type: "POST",
                url: "/role/insert",
                data:{"name":"欧桐江","password":"123123"},
                dataType:"text"
            });
        }
    </script>
</head>
<body>

<%--    角色1:<input type="text" name="roles[0].name" ><br>--%>
<%--    角色2:<input type="text" name="roles[1].name" ><br>--%>
<%--    角色3:<input type="text" name="roles[2].name" ><br>--%>
<%--    角色4:<input type="text" name="roles[3].name" ><br>--%>
<%--    <input type="button" value="提交" onclick="send()">--%>
<%--&lt;%&ndash;<form method="post" action="/role/insert">&ndash;%&gt;--%>
<%--    <input id="name" type="text" value="成昆" name="name">--%>
<%--    <input type="button" value="提交" onclick="send()">--%>
<%--&lt;%&ndash;</form>&ndash;%&gt;--%>

<br>
    <form action="/role/uploadFile" method="POST" enctype="multipart/form-data">
        name:<input name="name" type="text"><br>
        file1:<input name="file" type="file"><br>
        file2:<input name="file" type="file"><br>
        file3:<input name="file" type="file"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
