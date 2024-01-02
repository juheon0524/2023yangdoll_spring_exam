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
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<h3>메인에 들어있는 첫번째내용임</h3>
	<%
		String name="홍길동"; //메인에서 데이터를 생성
		request.setAttribute("iname", name);
	%>
	<jsp:include page="sub.jsp">
		<jsp:param value="홍길동" name="irum"/>
		<jsp:param value="400" name="age"/>
	</jsp:include>		
	<h4>여기는 메인의 푸터입니다.</h4>
	<h4>여기는 메인의 푸터입니다.</h4>
	<h4>여기는 메인의 푸터입니다.</h4>
</body>
</html>