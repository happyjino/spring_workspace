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
<script>
function valueChk(){
	let id = document.getElementById("id");
	let pwd1 = document.getElementById("pwd1");
	
	if(id.value == ""){
		alert('아이디는 필수 항목입니다.');
		id.focus();
	}else if(pwd1.value == ""){
		alert('비밀번호는 필수 항목입니다.');
		pwd1.focus();
	}else{
		fo.submit()
	}
}
function pwdChk(){
	let pwd1 = document.getElementById("pwd1");
	let pwd2 = document.getElementById("pwd2");
	let label = document.getElementById("label");
	if(pwd1.value == pwd2.value){
		label.innerHTML = "일치합니다"
	}else{
		label.innerHTML = "<b>불일치합니다.</b>"
		pwd2.value=""
		pwd1.value=""
		pwd1.focus()
	}
	
}
</script>


</head>
<body>
	
	<div class="wrap">
		<div style="width:300px; margin: auto;">
			<form id="fo" action="register" method="post">
				<input  class="form-control" type="text" id="id" name="id" placeholder="input id"><br>
				<input  class="form-control" type="text" id="pwd1" name="pwd" placeholder="input password"><br>
				<input  class="form-control" type="text" id="pwd2" placeholder="password check" onchange="pwdChk()"><label id="label" value="aaaaa"></label><br>
				<input  class="form-control" type="text" id="addr1" name="addr1" readonly placeholder="우편번호">
				<input type="button" value="우편번호 찾기" onclick="daumPost()"><br>
				<input  class="form-control" type="text" id="addr2" name="addr2" readonly placeholder="주소"><br>
				<input  class="form-control" type="text" id="addr3" name="addr3" placeholder="상세 주소"><br>
				
				<input type="button" onclick="valueChk()"  class="btn btn-info" value="회원가입">
			</form>
		</div>
	</div>

</body>
</html>