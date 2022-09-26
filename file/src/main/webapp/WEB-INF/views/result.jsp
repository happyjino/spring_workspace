<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="dto" items="${list }">
		id : ${dto.id }<br>
		name : ${dto.name }<br>
		imgName : ${dto.imgName }<br>
		<a href="download?file=${dto.imgName }">${dto.imgName }</a>
		<br>
		<img src="download?file=${dto.imgName }" width="100px" height="100px">
		<hr>
	</c:forEach>
	<a href="form">업로드 이동</a>

</body>
</html>