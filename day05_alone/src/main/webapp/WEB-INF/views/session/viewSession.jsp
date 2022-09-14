<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

id : ${id } / ${sessionScope.id }<br>
gf : ${gf } / ${sessionScope.gf }<br>

<a href="makeSession">세션 만들기</a>
<a href="delSession">세션 삭제</a>

</body>
</html>