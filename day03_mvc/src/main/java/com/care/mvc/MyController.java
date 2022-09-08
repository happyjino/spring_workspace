package com.care.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	public MyController() {
		System.out.println("my controller");
	}
	
	@RequestMapping(value="index")
	public String memberIndex(Model model) {
		model.addAttribute("index", "기본 페이지 입니다.");
		return "member/index";
	}
	@RequestMapping("login")
	public String memberLogin(Model model) {
		model.addAttribute("test", "로그인 페이지 입니다.");
		return "member/login";
	}
	@GetMapping("logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("logout", "로그아웃 페이지 입니다.");
		mv.setViewName("member/logout");
		return mv;
	}
}
