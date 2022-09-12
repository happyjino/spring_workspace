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
		// System.out.println(dto.getId());
		// System.out.println(dto.getPw());
		// System.out.println(dto.getName());
		
		// System.out.println("ms : " + ms);
		// 이건 객체가 들어오는지 확인하는것!!
		// 이렇게 꼭 확인해주기
		
		ms.register(dto);
		
		return "index";
		// return "redirect:index";
	}
	@GetMapping("member_list")
	public String member_list(Model model) {
		model.addAttribute("list", ms.getList());
		
		return "list";
	}
}
