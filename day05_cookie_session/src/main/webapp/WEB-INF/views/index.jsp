<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function test(){
	alert('안녕하세요!!!')
}
</script>

<style type="text/css">
	h3 {color:olive;}
</style>

</head>
<body>
	
	<img src="resources/img/cat.jfif" width="100" height="100">
	<img src="/root/resources/img/cat.jfif" width="100" height="100">
	<img src="<%=request.getContextPath() %>/resources/img/cat.jfif" width="100" height="100">
	<hr>
	<img src="/root/img/cat.jfif" width="100" height="100">

	<hr>
	<h3 onclick="test()">index.jsp</h3>
</body>
</html>