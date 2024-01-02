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
	<p>
		Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illo perferendis aliquid obcaecati et iusto iste sed facilis rerum laborum ipsum tempore expedita adipisci numquam accusantium quia cupiditate omnis alias quisquam.
	</p>
	<p>
		Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illo perferendis aliquid obcaecati et iusto iste sed facilis rerum laborum ipsum tempore expedita adipisci numquam accusantium quia cupiditate omnis alias quisquam.
	</p>
	<p>
		Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illo perferendis aliquid obcaecati et iusto iste sed facilis rerum laborum ipsum tempore expedita adipisci numquam accusantium quia cupiditate omnis alias quisquam.
	</p>
	
	<%
		response.sendRedirect("http://www.google.com");
		//2개의 요청이된다. 1)response02.jsp요청 => 2)http://www.google.com요청이된다.
	%>
</body>
</html>