<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
function daumPost(){
    new daum.Postcode({
        oncomplete: function(data) {
            let addr1 = document.getElementById("addr1")
            let addr2 = document.getElementById("addr2")
            let addr3 = document.getElementById("addr3")
            if(data.userSelectedType == 'R'){
            	addr1.value = data.zonecode
            	addr2.value = data.roadAddress
            }else{
            	addr1.value = data.zonecode
            	addr2.value = data.jibunAddress
            }
            addr3.focus()
        }
    }).open();
}
</script>
<script>
function value_chk(){
	let id = document.getElementById("id")
	let pwd1 = document.getElementById("pwd1")
	if(id.value == ""){
		alert('아이디는 필수 입력 항목입니다.')
		id.focus()
	}else if(pwd1.value == ""){
		alert('비밀번호는 필수 입력 항목입니다.')
		pwd1.focus()
	}else{
		fo.submit()
	}
}

function pwd_chk(){
	let pwd1 = document.getElementById("pwd1")
	let pwd2 = document.getElementById("pwd2")
	let label = document.getElementById("chkMessage")
	
	if(pwd1.value != pwd2.value){
		label.innerHTML = "<b>비밀번호가 일치하지 않습니다.</b>"
		pwd1.value = ""
		pwd2.value = ""
		pwd1.focus()
	}else{
		label.innerHTML = "비밀번호가 일치합니다."
	}
}
</script>

</head>
<body>
	<%@ include file="../default/header.jsp" %>
	<div class="formwrap" align="center">
		<h3>회원가입</h3>
		<form id="fo" action="register" method="post">
			<input class="form-control" type="text" name="id" id="id" placeholder="아이디"><br>
			<input class="form-control" type="password" name="pwd" id="pwd1" placeholder="비밀번호"><br>
			<input class="form-control" type="password" id="pwd2" onchange="pwd_chk()" placeholder="비밀번호 확인"><label id="chkMessage"></label><br>
			<input class="form-control" type="text" id="addr1" name="addr1" readonly placeholder="우편번호">
			<input type="button" value="우편번호 찾기" onclick="daumPost()"><br>
			<input class="form-control" type="text" id="addr2" name="addr2" readonly placeholder="주소"><br>
			<input class="form-control" type="text" id="addr3" name="addr3" placeholder="상세주소"><br>
			<input type="button" onclick="value_chk()" value="회원가입"><br>
		</form>
	</div>

</body>
</html>