<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${logout }</h1>
	<br>
	<a href="<%= request.getContextPath() %>/index">로그인 페이지</a> <a href="index">기본 페이지</a>
</body>
</html>