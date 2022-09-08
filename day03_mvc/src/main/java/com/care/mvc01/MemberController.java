package com.care.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	MemberService ms;
	public MemberController() {
		System.out.println("member controller");
	}
//	경로 안 겹치게 조심할 것! 그냥 index 하면 에러난다~
	@GetMapping("mem/index")
	public String index() {
		ms = new MemberService();
		ms.index();
		return "member02/index";
	}
	
}	
