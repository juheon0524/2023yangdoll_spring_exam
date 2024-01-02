<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" isErrorPage="true"%>
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
	<h1>요청하신 페이지를 찾을수없습니다..</h1>
	<%= exception.getClass().getName() %> 파일에서 발생된 오류
	오류 메세지 : <%= exception.getMessage() %>
</body>
</html>