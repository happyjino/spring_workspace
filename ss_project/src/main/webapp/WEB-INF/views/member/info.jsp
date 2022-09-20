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
		<h2>&nbsp;&nbsp; ${member.id } 정보</h2><br>
		<table border="1">
			<tr>
				<th>아이디</th><td>${member.id }</td>
			</tr>
			<tr>
				<th>비밀번호</th><td>${member.pwd }</td>
			</tr>
			<tr>
				<th>주소</th><td>${member.addr2 } ${member.addr3 }</td>
			</tr>
		</table><br>
		<c:choose>
			<c:when test="${login == member.id }">
				<form action="del" method="post">
					<input type="hidden" name="id" value="${member.id }">
					<input type="submit" value="삭제">
				</form>
				<a href="del?id=${member.id }">삭제</a>
			</c:when>
			<c:otherwise>
			</c:otherwise>
		</c:choose>
		
	</div>
	
</body>
</html>