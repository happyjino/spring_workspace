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
		Cookie cookie = new Cookie("jinhoCookie", "choco");
		cookie.setMaxAge(10);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		return "cookie/cookie";
	}
}