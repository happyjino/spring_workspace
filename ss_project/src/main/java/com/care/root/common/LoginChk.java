package com.care.root.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginChk extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			//response.sendRedirect("login");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			//out.print("<h1>로그인 진행하세요</h1>");
			out.print("<script>alert('로그인 진행하세요');location.href='/root/member/login'</script>");
			
			return false;
		}
		return true;
	}
	
}
