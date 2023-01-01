<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/26
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book</title>
</head>
<body>
<h1>图书信息</h1>
${bookcontent}
<hr><hr>
<h2>图书添加或者删除</h2>
<form action="${pageContext.request.contextPath}/addbook.action" method="get">
    输入图书名称:<input type="text" name="bookname"><br>
    输入图书作者:<input type="text" name="author"><br>
    输入图书简介:<input type="text" name="intro"><br>
    输入图书分类:<input type="text" name="category"><br>
    <input type="submit" value="添加">
</form>

<form action="${pageContext.request.contextPath}/deletebook.action" method="get">

    输入你要删除的图书名称:<input type="text" name="bookname"><br>
    <input type="submit" value="删除">
</form>

</body>
</html>
