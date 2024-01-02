<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="memberJoin" method="get">
	<label for="memId">아이디</label><input type="text" id="memId" name="memId" /><br />
	<label for="memPassword">비밀번호</label><input type="password" id="memPassword" /><br />
	<label for="memPassword">비밀번호확인</label><input type="password" id="memPassword" name="memPassword" /><br />
	<label for="memName">회원명</label><input type="text" id="memName" name="memName" /><br />
	<label for="email">메일주소</label><input type="text" id="email" name="email" /><br />
	<label for="postCode">우편번호</label><input type="text" id="postCode" name="postCode" /><br />
	<label for="detailAddress">상세주소</label><input type="text" id="detailAddress" name="detailAddress" /><br />
	<input type="submit" value="회원가입" />
	<input type="reset" value="입력취소" />
</form>
</body>
</html>