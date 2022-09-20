<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function info(id){
		location.href = "info?id="+id;
	}
</script>

</head>
<body>
	<%@ include file="../default/header.jsp" %><br>
	<div align="center">
		<h2>&nbsp;&nbsp;회원목록</h2><br>
		<table class="table table-hover">
			<tr>
				<th width="200">아이디</th>
				<th width="200">비밀번호</th>
				<th width="200">주소</th>
			</tr>
			<c:forEach var="member" items="${list }">
				<tr>
					<td onclick="info('${member.id}')">${member.id }</td>
					<td>${member.pwd }</td>
					<td>${member.addr2} ${member.addr3 }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>