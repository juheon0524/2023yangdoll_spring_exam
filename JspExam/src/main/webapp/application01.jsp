<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

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
	String url = application.getInitParameter("url");	
	String driverClass = application.getInitParameter("driver");
	Class.forName(driverClass);
	Connection con = DriverManager.getConnection(url,"juheon","juheon");
%>
<p>초기화 파아메터로 얻어온 값(url) : <%= url %></p>
<p>초기화 파아메터로 얻어온 값(driver) : <%= driverClass %></p>

<p>was(Tomcat) 정보 : <%= application.getServerInfo() %></p>
<p>was(Tomcat) 메인 버전 : <%= application.getMajorVersion() %></p>
<p>was(Tomcat) 서브 버전 : <%= application.getMinorVersion() %></p>
</body>
</html>