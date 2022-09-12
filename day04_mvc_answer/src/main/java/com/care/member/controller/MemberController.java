package com.care.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	@PostMapping("register")
	public String register() {
		
		return null;
	}
	
}
