<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%--
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] datas = "나의 살던 고향은".split(" ");
	%>
	<h1>넘겨받은 이름의 4번째 문자</h1>
	<%= request.getParameter("name") %>
	<%= datas[3] %>
</body>
</html>