<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%--
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
--%>
<%
	String firstParam = request.getParameter("firstParam");
	String[] secondParams = request.getParameterValues("secondParams");
			// 입력폼에서 checkbox로 넘어온 자료, select의 멀티 속성 => 같은이름을 가진 자료가 여러개 전달될 때
					
	Enumeration<String> enumer = request.getParameterNames();
	while(enumer.hasMoreElements()){
		System.out.println("넘겨받은 파라메터 이름 => " + enumer.nextElement());
	}
	
	System.out.println("==================");
	
	Map<String, String[]>parMap = request.getParameterMap();
	Set<String> parKey = parMap.keySet();
	Iterator<String> iter = parKey.iterator();
	while(iter.hasNext()){
		String paraName = iter.next();
		System.out.println("넘겨받은 파라메터 이름 => " + paraName);
		System.out.println("넘겨받은 파라메터 자료 => " + parMap.get(paraName));
		for(int i = 0; i < parMap.get(paraName).length; i=i+1){
			System.out.println(parMap.get(paraName)[i]);
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>넘겨받은 자료출력</p>
	<p><%= firstParam %></p>
	<p><%= secondParams[0] %></p>
	<p><%= secondParams[1] %></p>
</body>
</html>