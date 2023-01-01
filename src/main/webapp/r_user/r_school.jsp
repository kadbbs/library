<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/26
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>school</title>
</head>
<body>
${schoolname}
<hr><hr>
<form action="${pageContext.request.contextPath}/addschool.action" method="get">

    添加学校:<input type="text" name="schoolname"><br>
    <input type="submit" value="添加">
</form>

<form action="${pageContext.request.contextPath}/deleteschool.action" method="get">

    输入你要删除的学校的名字:<input type="text" name="schoolname"><br>
    <input type="submit" value="删除">
</form>


</body>
</html>
