<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%--
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
--%>

<%
	String sessionId = session.getId();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String logCheck = (String)session.getAttribute("logCheck");
		if( logCheck != null){
			out.println("<p>" + logCheck + "님</p>");
			out.println( "<a href=\"logout.jsp\">로그아웃</a>");
		} else {
	%>
	<form action="login.jsp" method="post">
		<input type="text" name="userId"/><br />
		<input type="password" name="pwd"/><br />

		<input type="submit" value="로그인"/>
		
		
	</form>
	<%
	}
	%>
		<div>
			<section>
				<ul>
		            <li><a href="sangpumDetail.jsp?spno=1111">상품목록1111</a></li>
		            <li><a href="sangpumDetail.jsp?spno=2222">상품목록2222</a></li>
		            <li><a href="sangpumDetail.jsp?spno=3333">상품목록3333</a></li>
		            <li><a href="sangpumDetail.jsp?spno=4444">상품목록4444</a></li>
		            <li><a href="sangpumDetail.jsp?spno=5555">상품목록5555</a></li>
		         </ul>
			</section>
			<aside>	
				<%@ include file="account.jspf" %>
			</aside>
			<a href="./indexsub.jsp">서브페이지가기</a>
		</div>
		<footer>
			<h3>회사기본정보</h3>
		</footer>
</body>
</html>