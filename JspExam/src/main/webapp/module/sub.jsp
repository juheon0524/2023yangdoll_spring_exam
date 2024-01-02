<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

	<hr />
	<p>메인에서 만든 데이터를 여기서 사용...</p>
	<p>넘겨받은자료 : <%= request.getParameter("irum") %></p>
	<p>넘겨받은자료 : <%= request.getParameter("age") %></p>
	<p>서브에 있는 내용입니다...</p>
	<p>서브에 있는 내용입니다...</p>
	<hr />
	<p>메인에서 setAttribute 데이터를 여기서 사용...</p>
	<p>넘겨받은자료 : <%= request.getAttribute("iname") %></p>
	<p>서브에 있는 내용입니다...</p>
	<p>서브에 있는 내용입니다...</p>
	<hr />
