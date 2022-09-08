package com.care.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("make")
	public String make() {
		return "make";
	}
	
	@RequestMapping("check")
	public String check() {
		return "check";
	}
	
	@PostMapping("result")
	public void make() {
		ms.make();
	}
	
}
