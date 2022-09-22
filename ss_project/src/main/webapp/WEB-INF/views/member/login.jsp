<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../default/header.jsp" %>
	<div class="wrap" align="right">
		<form action="login_chk" method="post">
			<input type="text" name="id"><br>
			<input type="password" name="pwd"><br>
			<input type="submit" value="로그인">
			<a href="register">회원가입</a><br>
			<input type="checkbox" name="auto_login">로그인 유지
		</form>
	</div>


</body>
</html>