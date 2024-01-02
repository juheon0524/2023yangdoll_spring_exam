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
   String sangpumCookValue = "";
   Cookie[] cookies = request.getCookies();
   
   if( cookies != null){
      for(Cookie cok : cookies){
         if( cok.getName().equals("sangpumInfo") ){
            sangpumCookValue = cok.getValue() ;
        }
      }
   }
   /* 아래 if구문은 다른 형태로 작성되어야 할 수 도 있음 = 전략에 따라서 유도리있게 */
   if( !sangpumCookValue.contains("2222")){
      sangpumCookValue = sangpumCookValue + "A" + "2222";
   }
   Cookie cookie = new Cookie ( "sangpumInfo" , sangpumCookValue) ; 
   cookie.setPath("/");
   cookie.setMaxAge(60*60*3);
   response.addCookie(cookie) ; 
%>
	<h1>상품 상세정보 : 의류상품</h1>
</body>
</html>