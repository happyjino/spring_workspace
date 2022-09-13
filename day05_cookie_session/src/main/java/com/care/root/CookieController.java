package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	@GetMapping("cookie")
	public String myCookie(
			HttpServletResponse response, 
			HttpServletRequest request,
			@CookieValue(value="myCookie", required=false ) Cookie cook ) {
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
		
		Cookie cookie = new Cookie("myCookie", "testCookie");
		cookie.setMaxAge(5);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		return "cookie/cookie";
	}
	@GetMapping("popup")
	public String popup() {
		return "cookie/popup";
	}
	
}
