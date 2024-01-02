<%@page import="java.util.Enumeration"%>
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
	<%-- <%
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println(headerName + " : " + headerValue + "<br />");
		}
	%> --%>
	
	<%
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName); %>
			<%= headerName %> : <%= headerValue %><br />
		<% 	
		}
	%>
</body>
</html>