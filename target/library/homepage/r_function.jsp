<%--
  Created by IntelliJ IDEA.
  User: kab
  Date: 2022/12/25
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>r_all_function</title>
</head>
<body>
<h1>请选择你的需求</h1>
<a href="${pageContext.request.contextPath}/selectschool.action">学校管理</a><hr>
<a href="${pageContext.request.contextPath}/selectbookcategory.action">图书分类管理</a><hr>
<a href="${pageContext.request.contextPath}/selectbook.action">图书信息管理</a><hr>
<a href="${pageContext.request.contextPath}/selectuser.action">用户管理</a><hr>
<a href="${pageContext.request.contextPath}/demo.action">借阅管理</a><hr>
<a href="${pageContext.request.contextPath}/notice.action">公告管理</a><hr>
</body>
</html>
