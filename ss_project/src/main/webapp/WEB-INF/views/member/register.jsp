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
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
            console.log(data)
            if(data.userSelectedType == 'R'){
            	addr = data.roadAddress
            }else{
            	addr = data.jibunAddress
            }
            console.log(data.userSelectedType)
            console.log(addr)
            
            document.getElementById("addr1").value = data.zonecode
            document.getElementById("addr2").value = addr
            document.getElementById("addr3").focus()
        }
    }).open();
}
</script>

</head>
<body>
	<%@ include file="../default/header.jsp" %><br>
	<div align="center">
		<h2>회원등록</h2>
		<form action="register_member" method="post">
			<table border="1">
				<tr><td><input type="text" name="id" placeholder="아이디"></td></tr>
				<tr><td><input type="password" name="pwd" placeholder="비밀번호"></td></tr>
				<tr><td><input type="text" name="addr1" id="addr1" readonly placeholder="우편번호"><input type="button" value="우편번호 찾기" onclick="daumPost()"></td></tr>
				<tr><td><input type="text" name="addr2" id="addr2" readonly placeholder="주소"></td></tr>
				<tr><td><input type="text" name="addr3" id="addr3" placeholder="상세주소"></td></tr>
				<tr><td><input type="submit" value="회원가입"></td></tr>
			</table>
		</form>
	</div>

</body>
</html>