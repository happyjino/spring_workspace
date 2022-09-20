<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../default/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="${contextPath }/resources/js/daumpost.js"></script>


</head>
<body>
	
	<div class="wrap">
		<div style="width:300px; margin: auto;">
			<form id="fo" action="register" method="post">
				<input  class="form-control" type="text" id="id" name="id" placeholder="input id"><br>
				<input  class="form-control" type="text" id="pwd1" name="pwd" placeholder="input password"><br>
				<input  class="form-control" type="text" id="pwd2" placeholder="password check"><br>
				<input  class="form-control" type="text" id="addr1" name="addr1" placeholder="우편번호">
				<input type="button" value="우편번호 찾기" onclick="daumPost()"><br>
				<input  class="form-control" type="text" id="addr2" name="addr2" placeholder="주소"><br>
				<input  class="form-control" type="text" id="addr3" name="addr3" placeholder="상세 주소"><br>
				
				<input type="button" onclick="valueChk()"  class="btn btn-info" value="회원가입">
			</form>
		</div>
	</div>

</body>
</html>