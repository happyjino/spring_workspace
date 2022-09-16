package com.care.root.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	//@Autowired MemberService ms;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
}
