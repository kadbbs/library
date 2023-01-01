<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/28
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
<h1>用户添加或者删除</h1>
${usercontent}
<hr><hr>
<form action="${pageContext.request.contextPath}/adduser.action" method="get">
    输入用户ID:<input type="text" name="id"><br>
    输入用户姓名:<input type="text" name="name"><br>
    输入用户账户:<input type="text" name="account"><br>
    输入密码:<input type="text" name="pwd"><br>
    <input type="submit" value="创建用户">
</form>

<form action="${pageContext.request.contextPath}/deleteuser.action" method="get">

    输入你要删除的用户ID:<input type="text" name="id"><br>
    <input type="submit" value="删除">
</form>
</body>
</html>
