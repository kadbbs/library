<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/27
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>log</title>
</head>
<body>
<hr>
<form action="${pageContext.request.contextPath}/stutealog.action" method="get">
    username:<input type="text" name="xxx"><br>
    password:<input type="password" name="yyy"><br>
    <input type="submit" value="login">
</form>
<hr>
${logfail}
</body>
</html>
