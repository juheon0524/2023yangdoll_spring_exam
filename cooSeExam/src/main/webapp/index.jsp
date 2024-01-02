<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
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
	<h1>우리상품판매 사이트에 온 것을 환영합니다.</h1>
	<a href="./sangpum/sang1.jsp">상품1</a><br />
	<a href="./sangpum/sang2.jsp">상품2</a><br />
	<a href="./sangpum/sang3.jsp">상품3</a><br />
	<a href="./sangpum/sang4.jsp">상품4</a><br />
	<hr />
	<%
		Map<String, String> sangpumMap = new HashMap<>();
		sangpumMap.put("1111", "전자제품"); sangpumMap.put("2222", "의류상품");
		sangpumMap.put("3333", "컴퓨터상품"); sangpumMap.put("4444", "식료품");
		
		Cookie[] cookies = request.getCookies();
		String[] sangpumViewList = null;
		if(cookies !=null){
			for(Cookie cok : cookies){
				if(cok.getName().equals("sangpumInfo")){
					sangpumViewList = cok.getValue().substring(1).split("A");
				}
			}
		}
		
		if(sangpumViewList != null){
			out.print("<p>최근 본 상품의 개수 : " +sangpumViewList.length + "</p>");
			for(int i=0; i<sangpumViewList.length; i+=1){
				out.println("<li>" + (i+1) + "번쨰 상품 : " + sangpumMap.get(sangpumViewList[i]) + "</li>");
			}
		}
	%>
</body>
</html>