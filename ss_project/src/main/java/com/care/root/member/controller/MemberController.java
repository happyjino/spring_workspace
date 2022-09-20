package com.care.root.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("login_chk")
	public String login_chk(
			@RequestParam String id,
			@RequestParam String pwd,
			HttpSession session,
			Model model) {
		int result = ms.login_chk(id, pwd);
		if(result == 0) {
			session.setAttribute("login", id);
			return "redirect:success";
		}else {
			return "redirect:login";
		}
	}
	@GetMapping("success")
	public String success(){
		return "member/successLogin";
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		return "index";
	}
	@GetMapping("memberinfo")
	public String memberinfo(HttpSession session) {
		if(session.getAttribute("login") != null) {
			ArrayList<MemberDTO> list = ms.getAllMember();
			session.setAttribute("list", list);
			return "member/memberinfo";
		}
		return "redirect:login";
	}
	@GetMapping("info")
	public String info(Model model, @RequestParam String id) {
		MemberDTO member = ms.getMember(id);
		model.addAttribute("member", member);
		return "member/info";
	}
	@GetMapping("register")
	public void register() {}
	
	@PostMapping("register")
	public String register_member(
			MemberDTO dto,
			@RequestParam String id,
			@RequestParam String pwd,
			@RequestParam String addr1,
			@RequestParam String addr2,
			@RequestParam String addr3) {
		ms.register(dto);
		return "redirect:/index";
	}
	@GetMapping("del")
	public String del(@RequestParam String id, HttpSession session) {
		if(session.getAttribute("login").equals(id)) {
			ms.delAccount(id);
			session.invalidate();
		}
		return "redirect:/index";
	}
}
