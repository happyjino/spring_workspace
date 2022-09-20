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
	<div class="wrap" align="center">
	<h3>멤버 정보</h3>
	<table border="1">
		<tr>
			<th width="200">아이디</th>
			<th width="200">비밀번호</th>
			<th width="200">주소</th>
		</tr>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.id}</td>
				<td>${dto.pwd}</td>
				<td>${dto.addr2 } ${dto.addr3 }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
</body>
</html>