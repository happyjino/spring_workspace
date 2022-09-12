package com.care.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("index")
	public String index() {
		return "index";
	}
	@GetMapping("register_form")
	public String register_form() {
		return "register_form";
	}
	
}
