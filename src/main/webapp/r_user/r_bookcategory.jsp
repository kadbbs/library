<%--
  Created by IntelliJ IDEA.
  User: 86195
  Date: 2022/12/28
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookcategory</title>
</head>
<body>
${bookcategorycategory}
<hr><hr>
<form action="${pageContext.request.contextPath}/addbookcategory.action" method="get">

    添加图书分类:<input type="text" name="bookcategorycategory"><br>
    <input type="submit" value="添加">
</form>

<form action="${pageContext.request.contextPath}/deletebookcategory.action" method="get">

    输入你要删除的图书分类的名字:<input type="text" name="bookcategorycategory"><br>
    <input type="submit" value="删除">
</form>


</body>
</html>
