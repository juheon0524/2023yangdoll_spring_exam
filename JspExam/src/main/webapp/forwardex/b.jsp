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
	<h1>b를 선택했기 떄문에 그 작업이 이루어짐</h1>
		<h2><%= request.getParameter("memValue") %> 등급의 회원님 이십니다.</h2>
	<h2>속성을 통해 전달된 자료 <%=request.getAttribute("attrData")  %></h2>
</body>
</html>