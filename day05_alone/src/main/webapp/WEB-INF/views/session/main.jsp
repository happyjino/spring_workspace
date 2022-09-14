<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.nickname}님 환영합니다.<br>
	아이디 ${sessionScope.login } 로그인 완료! <br>
	
	<a href="login">로그인</a><br>
	<a href="logout">로그아웃</a><br>
</body>
</html>