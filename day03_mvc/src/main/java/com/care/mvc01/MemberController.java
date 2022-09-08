package com.care.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	public MemberController() {
		System.out.println("member controller");
	}
//	경로 안 겹치게 조심할 것! 그냥 index 하면 에러난다~
	@GetMapping("mem/index")
	public String index() {
		// ms = new MemberService();
		// 이게 DI방식인데 spring은 객체를 잘 만들지 않고 xml에서 만들어서 사용한다!
		// 하지만 요즘은 xml을 잘 쓰지 않는 추세이다. 자바코드를 이용한다! 어노테이션!
		
		System.out.println("ms : " + ms);
		ms.index();
		return "member02/index";
	}
	
}	
