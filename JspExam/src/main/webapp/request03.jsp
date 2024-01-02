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
		String irum = request.getParameter("irum");
		out.print("<h1>" + "넘겨받은 자료 " + irum + "</h1>");
	%>
	<h1>넘겨받은 자료 <%= irum %></h1>
</body>
</html>