package com.care.root.member.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

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
			@RequestParam(value="auto_login", required=false) String autoLogin,
			HttpSession session,
			HttpServletResponse response,
			Model model) {
		int result = ms.login_chk(id, pwd);
		if(result == 0) {
			session.setAttribute("login", id);
			if(autoLogin != null) {
				int time = 60*60*24*90;
				Cookie cook = new Cookie("loginCookie", id);
				cook.setMaxAge(time);
				cook.setPath("/");
				response.addCookie(cook);
				ms.keepLogin(id);
			}
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
	public String logout(HttpSession session, HttpServletRequest req, HttpServletResponse res) {
		session.removeAttribute("login");
		Cookie cook = WebUtils.getCookie(req, "loginCookie");
		if(cook != null) {
			cook.setMaxAge(0);
			res.addCookie(cook);
		}
		
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
	@GetMapping("modify")
	public String modify(@RequestParam String id, HttpSession session) {
		if(session.getAttribute("login").equals(id)) {
			MemberDTO member = ms.getMember(id);
			session.setAttribute("member", member);
			return "member/modify";
		}
		return "redirect:/index";
	}
	@PostMapping("modify")
	public String modify_member(MemberDTO dto, HttpSession session) {
		if(dto.getPwd().equals("")) {
			MemberDTO member = (MemberDTO)session.getAttribute("member");
			dto.setPwd(member.getPwd());
		}else {
			dto.setPwd(e.encode(dto.getPwd()));
		}
		ms.modify(dto);
		return "redirect:memberinfo";
	}
}
