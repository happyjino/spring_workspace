<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../default/header.jsp" %><br>
	<div align="center">
		<h2>회원등록</h2>
		<form action="register_member" method="post">
			<table border="1">
				<tr><td><input type="text" name="id" placeholder="아이디"></td></tr>
				<tr><td><input type="password" name="pwd" placeholder="비밀번호"></td></tr>
				<tr><td><input type="text" name="addr1" placeholder="우편번호"></td></tr>
				<tr><td><input type="text" name="addr2" placeholder="지역"></td></tr>
				<tr><td><input type="text" name="addr3" placeholder="도로명"></td></tr>
				<tr><td><input type="submit" value="회원가입"></td></tr>
			</table>
		</form>
	</div>

</body>
</html>