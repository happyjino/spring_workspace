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

<div style="height:500px">
	<h2 style="text-align:center;">로그인 페이지 입니다</h2>
	<div style="text-align:right;">
		<form action="login_chk" method="post">
			<input type="text" name="id" placeholder="id"><br>
			<input type="password" name="pwd" placeholder="password"><br>
			<input type="submit" value="로그인">
		</form>
		<a href="register">회원가입</a>
	</div>
</div>

<%@ include file="../default/footer.jsp" %>
	
</body>
</html>