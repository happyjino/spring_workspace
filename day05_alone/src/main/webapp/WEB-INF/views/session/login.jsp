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
		<form action="login_chk" method="post">
			<input type="text" name="id" placeholder="id"><br>
			<input type="password" name="pw" placeholder="password"><br>
			<input type="submit" value="로그인">
		</form>
	</c:when>
	<c:otherwise>
		${sessionScope.nickname }님으로 로그인된 상태입니다.<br>
		<a href="#" onclick="logoutFunc()">로그아웃</a><br>
		<a href="main">main이동</a>
	</c:otherwise>
</c:choose>



</body>
</html>