<%@page import="org.apache.catalina.connector.Response"%>
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
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		// 데이터베이스가 없는 관계로 userId와 userPwd가 같으면 로그인 성공한 것으로 가정
		// 로그인에 성공하면 회원 전용페이지로 접속(연결)
		if(userId.equals(userPwd)){
			Cookie cookie = CookieBox.createCookie("loginCheck","1");
			response.addCookie(cookie);
			response.sendRedirect("./memberPage.jsp");
		}else{
			response.sendRedirect("./loginForm.jsp");
		}
	
	%>
</body>
</html>