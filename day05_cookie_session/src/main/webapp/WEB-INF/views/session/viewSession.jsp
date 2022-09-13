<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id : ${id }<br>
	addr : ${addr }, ${ sessionScope.addr }<hr>
	<a href="makeSession">makeSession</a>
	<a href="delSession">delSession</a>

</body>
</html>