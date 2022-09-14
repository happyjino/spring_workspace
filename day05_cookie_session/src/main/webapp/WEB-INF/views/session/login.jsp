<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/root/resources/js/logout.js"></script>
</head>
<body>login.jsp<br>

	<c:choose>
		<c:when test="${login == null}">
			<form action="chk_user" method="post">
				<input type="text" name="id" placeholder="input id"><br>
				<input type="password" name="pw" placeholder="input password"><br>
				<input type="submit" value="로그인"><br>
			</form>
		</c:when>
		<c:otherwise>
			${nick_name } 로그인 상태입니다.
			<hr>
			<a href="#" onclick="logoutFunc()">로그아웃</a>
			<a href="main">main이동</a>
		</c:otherwise>
	</c:choose>

</body>
</html>