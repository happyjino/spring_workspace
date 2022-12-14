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
	public String myCookie(
			HttpServletResponse response, Model model,
			HttpServletRequest request,
			@CookieValue(value="myCookie", required=false ) Cookie cook ) {
		
		model.addAttribute("cook", cook);
		
		System.out.println("cook : " + cook);
		if(cook != null) {
			System.out.println(cook.getName());
			System.out.println(cook.getValue());
		}
		/*
		Cookie[] cooks = request.getCookies();
		for(Cookie c : cooks) {
			System.out.println(c.getName());
			System.out.println(c.getValue());
		} 예전 방식들~~~
		*/
		/*
		Cookie cookie = new Cookie("myCookie", "testCookie");
		cookie.setMaxAge(10000000);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		*/
		return "cookie/cookie";
	}
	@GetMapping("popup")
	public String popup() {
		return "cookie/popup";
	}
	@GetMapping("cookieChk")
	public void cookieChk(HttpServletResponse response,
			HttpServletRequest request) {
		Cookie cookie = new Cookie("myCookie", "testCookie");
		cookie.setMaxAge(100);
		cookie.setPath(request.getContextPath());
		
		response.addCookie(cookie);
	}
}
