<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="/root/resources/js/testjs.js" type="text/javascript">

</script>

<link rel="stylesheet" type="text/css" href="/root/resources/css/test.css">

<style type="text/css">
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