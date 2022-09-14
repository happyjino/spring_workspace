<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/root/resources/js/logout.js"></script>
</head>
<body>
	${nick_name } 님 환영합니다.
	아이디는 ${login }이군요
	<hr>
	<a href="#" onclick="logoutFunc()">로그아웃</a>
	<a href="login">login 이동</a>
</body>
</html>