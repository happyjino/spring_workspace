<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function popup(){
	if('${cook}' == ""){
		window.open("popup","","width=300,height=200,top=500,left=500")
	}
}
</script>

</head>
<body onload="popup()">
	cookie폴더 -> cookie.jsp
</body>
</html>