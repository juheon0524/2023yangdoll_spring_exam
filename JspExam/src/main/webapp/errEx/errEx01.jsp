<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" errorPage="./errPg/errView.jsp"%>
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
	<h1>넘겨받은 이름의 44444번째 문자</h1>
	<%= request.getParameter("name").charAt(3) %>
</body>
</html>