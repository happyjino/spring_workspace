<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function popup(){
	if('${cook}'==""){
		window.open("popup", "", "width=300, height=200, top=500, left=500");
	}
}
function delCookie(){
	location.href="delCookie";
}
</script>


</head>
<body onload="popup()">
	쿠키 생성 페이지
	<h3 onclick="delCookie()">쿠키 확인 버튼</h3>
	
</body>
</html>