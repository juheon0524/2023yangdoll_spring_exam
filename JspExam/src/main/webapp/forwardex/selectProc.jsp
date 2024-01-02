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
	String forwardPage = request.getParameter("jobSelect").toLowerCase()+".jsp";
%>
<jsp:forward page="<%= forwardPage %>" /> --%>

<!-- jsp안에서 if else if구문은 최악의 프로그램이 될 수 있다. 특히 조건에 따른 처리구문이 하나일 떄는 더더욱 그렇다. => if 구문으로 해결하는 방법을 생각하자 -->

<%-- <%
	if(jobSelect.equals("a")){ 
%>		
	<jsp:forward page="a.jsp" />
<%
	}else if(jobSelect.equals("b")){
%>
	<jsp:forward page="b.jsp" />
<%
	}else if(jobSelect.equals("c")){
%>	
	<jsp:forward page="c.jsp" />
<%
	}else if(jobSelect.equals("d")){
%>		
	<jsp:forward page="d.jsp" />
<%
	}else if(jobSelect.equals("e")){
%>	
	<jsp:forward page="e.jsp" />
<%
	}else{
%>
	<jsp:forward page="f.jsp" />
<%
	}
%> --%>

<!--  이런식으로 if문만 사용해서 해결해보자. -->
<%
	String jobSelect = request.getParameter("jobSelect");
	String attrData = "나는 속성에 저장된 값입니다.";
	request.setAttribute("attrData", attrData); //속성을 통해 서브 페이지에 값 전달
	if(jobSelect.equals("a"))
%>
	<jsp:forward page="a.jsp">
		<jsp:param value="준회원" name="memValue" /> 
	</jsp:forward>
<%
	if(jobSelect.equals("b"))
%>
	<jsp:forward page="b.jsp">
		<jsp:param value="정회원" name="memValue" />
	</jsp:forward>
<%
	if(jobSelect.equals("c"))
%>
	<jsp:forward page="c.jsp">
		<jsp:param value="우수회원" name="memValue" />
	</jsp:forward>

</body>
</html>