package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	@GetMapping("cookie")
	public String cookie(HttpServletResponse response, Model model,
			HttpServletRequest request,
			@CookieValue(value="jinhoCookie", required=false) Cookie cook) {
		
		model.addAttribute("cook", cook);
		
		System.out.println("cook : " + cook);
		if(cook != null) {
			System.out.println("@" + cook.getName());
			System.out.println("@" + cook.getValue());
		}
		/*
		Cookie[] coos = request.getCookies();
		for(Cookie c : coos) {
			System.out.println(c.getName());
			System.out.println(c.getValue());
		}
		*/
		return "cookie/cookie";
	}
	@GetMapping("popup")
	public String popup() {
		return "cookie/popup";
	}
	@GetMapping("make_cookie")
	public String make_cookie(
			HttpServletResponse response,
			HttpServletRequest request) {
		Cookie cookie = new Cookie("jinhoCookie", "choco");
		cookie.setMaxAge(20);
		cookie.setPath(request.getContextPath());
		
		response.addCookie(cookie);
		
		return "cookie/cookie";
	}
	@GetMapping("delCookie")
	public String delCookie(
			HttpServletResponse response,
			@CookieValue(value="jinhoCookie", required=false) Cookie cook) {
		
		cook.setMaxAge(0);
		response.addCookie(cook);
		
		return "redirect:cookie";
	}
}
