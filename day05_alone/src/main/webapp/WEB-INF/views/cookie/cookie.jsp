<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function cooki(){
	if('${cook }' == ""){
		alert('쿠키 없어요!');
	}else{
		alert('쿠키 있어요!');
	}
}
</script>


</head>
<body>
	쿠키 생성 페이지
	<h3 onclick="cooki()">쿠키 확인 버튼</h3>
	
</body>
</html>