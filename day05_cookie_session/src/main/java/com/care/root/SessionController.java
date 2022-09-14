package com.care.root;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {
	@GetMapping("makeSession")
	public String makeSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		
		session.setAttribute("id", "홍길동");
		session.setAttribute("addr", "산골짜기");
		
		return "session/makeSession";
	}
	@GetMapping("viewSession")
	public String viewSession(Model model) {
		model.addAttribute("id", "model id입니다.");
		
		return "session/viewSession";
	}
	@GetMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id"); // 특정 세션 만료
		// session.invalidate(); // 모든 세션 만료
		return "session/delSession";
	}
	@GetMapping("login")
	public String login() {
		return "session/login";
	}
	@PostMapping("chk_user")
	public String chkUser(
			@RequestParam String id,
			@RequestParam String pw,
			HttpSession session) {
		return null;
	}
}
