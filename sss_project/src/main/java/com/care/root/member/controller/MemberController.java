package com.care.root.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired MemberService ms;
	BCryptPasswordEncoder e = new BCryptPasswordEncoder();
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("login_chk")
	public String login_chk(
			@RequestParam String id,
			@RequestParam String pwd,
			HttpSession session) {
		
		int result = ms.login_chk(id, pwd);
		if(result == 0) {
			session.setAttribute("login", id);
			return "redirect:/index";
		}
		return "redirect:login";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		
		return "redirect:/index";
	}
	
	@GetMapping("memberinfo")
	public String memberinfo(Model model, HttpSession session) {
	
		ms.memberInfo(model);
		return "member/memberinfo";
		
	}
	@GetMapping("info")
	public String info(@RequestParam String id, HttpSession session) {
		ms.info(session, id);
		
		return "member/info";
	}
	@GetMapping("register")
	public void register() {}
	@PostMapping("register")
	public String register_member(MemberDTO dto) {
		
		//System.out.println(dto.getPwd());
		//System.out.println(e.encode(dto.getPwd()));
		dto.setPwd(e.encode(dto.getPwd()));
		ms.register_member(dto);
		return "redirect:/index";
	}
	@GetMapping("delete")
	public String delete(@RequestParam String id, HttpSession session) {
		ms.delete(id, session);
		
		return "redirect:/index";
	}
	@GetMapping("modify")
	public String modify() {
		
		return "member/modify";
	}
	@PostMapping("modify")
	public String modify_member(MemberDTO dto, Model model, HttpSession session) {
		ms.modify(dto, session);
		model.addAttribute("id", dto.getId());
		
		return "redirect:info";
	}
}
