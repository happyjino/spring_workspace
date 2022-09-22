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
		<h3>${member.id} 세부 정보</h3>
		<table class="table table-striped table-hover">
			<tr><th width="100">아이디</th><td width="100">${member.id }</td></tr>
			<tr><th>비밀번호</th><td>${member.pwd }</td></tr>
			<tr><th>우편번호</th><td>${member.addr1 }</td></tr>
			<tr><th>주소</th><td>${member.addr2 }</td></tr>
			<tr><th>상세주소</th><td>${member.addr3 }</td></tr>
			<c:if test="${member.autoLogin == 'nan' }">
				<tr><th>자동 로그인 여부</th><td>설정 안 함</td></tr>
			</c:if>
			<c:if test="${member.autoLogin != 'nan' }">
				<tr><th>자동 로그인 여부</th><td>설정함</td></tr>
			</c:if>
			<c:if test="${member.id == login }">
				<tr>
					<th>계정</th>
					<td>
						<a class="btn btn-outline-success" href="modify?id=${member.id }">수정</a>&nbsp;&nbsp;
						<a class="btn btn-outline-danger" href="delete?id=${member.id }">삭제</a>
					</td>
				</tr>
			</c:if>
			
		</table>
	</div>
	

</body>
</html>