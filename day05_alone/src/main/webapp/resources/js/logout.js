function logoutFunc(){
	let result = confirm("로그아웃 하시겠습니까?")
	console.log(result)
	if(result==true){
		location.href='logout'
	}
}