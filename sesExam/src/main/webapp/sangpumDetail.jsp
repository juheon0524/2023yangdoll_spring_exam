<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
		String spno = request.getParameter("spno");
		List<String> list = null;
		if(session.getAttribute("sangpumList") ==null){
			list = new ArrayList<String>();
		}else {
			list = (List<String>)session.getAttribute("sangpumList");
		}
				
		list.add(spno);
		session.setAttribute("sangpumList", list); 
	%>
	<p>상품목록<%= spno %> 의 상세한 정보입니다...</p>
	<a href="./">Home</a>
	<asdie>
		<%@ include file="account.jspf" %>
	</asdie>
</body>
</html>