package com.care.mvc02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("mc")
// mvc 패키지의 mycontroller와 이름이 겹치므로 어노테이션 옆에 괄호 안에 이름을 붙여줄 수 있다!
public class MyController {
	@GetMapping("my/index")
	public String index() {
		return "get_post/index";
	}
	@GetMapping("my/result")
	public String result01(HttpServletRequest request, Model model){
		System.out.println("method : " +  request.getMethod());
		System.out.println("name : " + request.getParameter("name"));
		System.out.println("age : " + request.getParameter("age"));
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("age", request.getParameter("age"));
		
		return "get_post/result";
	}
	@PostMapping("my/result")
	public String result01(
			@RequestParam String name,
			@RequestParam("age") int a,
			HttpServletRequest request, 
			Model model){
		System.out.println("method : " +  request.getMethod());
		System.out.println("name : " + request.getParameter("name"));
		System.out.println("age : " + request.getParameter("age"));
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name", name);
		model.addAttribute("age", a);
		
		return "get_post/result";
	}
	
}
