<%@page import="kr.com.juheon.util.CookieBox"%>
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
		CookieBox cb = new CookieBox(request);
		if( cb.exists("loginCheck")){
			out.println("<a href=\"loginOut.jsp\">로그아웃</a>");
		}else{
			out.println("<a href=\"loginForm.jsp\">로그인하기</a>");
		}
	%>
	<h3>메인화면 내용</h3>
	<h3>메인화면 내용</h3>
	<h3>메인화면 내용</h3>
	<h3>메인화면 내용</h3>
	<h3>메인화면 내용</h3>
		
</body>
</html>