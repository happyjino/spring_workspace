package com.care.root.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	
	@GetMapping("index")
	public String index() {
		System.out.println("컨트롤러 index");
		return "index";
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	@PostMapping("login_chk")
	public String login_chk(MemberDTO dto) {
		MemberDTO checkDTO = ms.login_chk(dto.getId());
		System.out.println("컨트롤러로 돌아옴");
		String checkPwd = checkDTO.getPwd();
		String inputPwd = dto.getPwd();
		if(checkPwd.equals(inputPwd)){
			return "member/successLogin";
		}
		
		return "redirect:login";
	}
}
