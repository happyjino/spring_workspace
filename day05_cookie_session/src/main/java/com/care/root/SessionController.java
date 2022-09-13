package com.care.root;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
	@GetMapping("makeSession")
	public String makeSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		
		session.setAttribute("id", "홍길동");
		session.setAttribute("addr", "산골짜기");
		
		return "session/makeSession";
	}
}