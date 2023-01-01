<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/26
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公告</title>
</head>
<body>
<h1>公告管理页面</h1>
${content}
<hr><hr>
<form action="${pageContext.request.contextPath}/add.action" method="get">
    输入公告ID:<input type="text" name="addid"><br>
    输入公告:<input type="text" name="content"><br>
    <input type="submit" value="发布">
</form>

<form action="${pageContext.request.contextPath}/delete.action" method="get">

    输入你要删除的公告ID:<input type="text" name="id"><br>
    <input type="submit" value="删除">
</form>

</body>
</html>
