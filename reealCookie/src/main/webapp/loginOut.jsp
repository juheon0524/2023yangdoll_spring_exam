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
		Cookie coki = cb.getCookie("loginCheck");
		coki.setMaxAge(0); //쿠키 삭제
		response.addCookie(coki);
		response.sendRedirect("./memberPage.jsp");
	%>
</body>
</html>