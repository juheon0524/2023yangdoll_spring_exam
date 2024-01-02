<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%--
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
--%>

<% 
	// 스크립트릿 이라고 한다. => java code를 사용한다.
	Date now = new Date();
	System.out.println("현재 시스템에 설정된 날짜 및 시간 " + now);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>서버에 설정된 시간 :<%= now %></p>
</body>
</html>