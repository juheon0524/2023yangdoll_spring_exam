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
	<form action="login.jsp" method="get">
		<input type="text" placeholder="아이디" name="userId" />
		<input type="password" placeholder="비밀번호" name="userPwd" />
		<button>로그인</button>
	</form>
</body>
</html>