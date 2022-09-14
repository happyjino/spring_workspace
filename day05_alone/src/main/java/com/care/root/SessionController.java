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
	public String makeSession(
			HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		
		session.setAttribute("id", "wlsgh1128");
		session.setAttribute("gf", "김채원");
		
		return "session/makeSession";
	}
	
	@GetMapping("viewSession")
	public String viewSession(Model model) {
		
		model.addAttribute("id", "model id입니다.");
		model.addAttribute("gf", "model gf입니다.");
		
		return "session/viewSession";
	}
	
	@GetMapping("delSession")
	public String delSession(HttpSession session) {
		
		session.removeAttribute("id");
		
		return "session/delSession";
	}
	@GetMapping("login")
	public String login() {
		return "session/login";
	}
	@PostMapping("login_chk")
	public String login_chk(
			@RequestParam String id,
			@RequestParam String pw,
			HttpSession session) {
		
		String DB_id="1", DB_pw="1", DB_name="홍길동";
		if(DB_id.equals(id) && DB_pw.equals(pw)) {
			session.setAttribute("login", DB_id);
			session.setAttribute("nickname", DB_name);
			return "session/main";
		}
		
		return "redirect:login";
	}
	@GetMapping("main")
	public String main() {
		
		return "session/main";
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
}
