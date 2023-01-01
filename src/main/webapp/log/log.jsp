<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/24
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Library System</title>
</head>
<body>
    <hr>
    <form action="${pageContext.request.contextPath}/log.action" method="get">
        username:<input type="text" name="xxx"><br>
        password:<input type="password" name="yyy"><br>
        <input type="submit" value="login">
    </form>
    <hr>
${logfail}

</body>
</html>
