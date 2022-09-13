package com.care.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.member.dto.MemberDTO;
import com.care.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired MemberService ms;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("register_form")
	public String register_form() {
		return "register_form";
	}
	@PostMapping("register")
	public String register(MemberDTO dto) {
		ms.register(dto);
		
		return "index";
	}
	@GetMapping("member_list")
	public String member_list(Model model) {
		model.addAttribute("list", ms.getList());
		
		return "list";
	}
}
