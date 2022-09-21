package com.care.root.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserCheck extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		if(id.equals(session.getAttribute("login")) == false) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			//out.print("<h1>로그인 진행하세요</h1>");
			out.print("<script>alert('잘못된 접근입니다.');location.href='/root/member/memberinfo'</script>");
			return false;
		}
		
		return true;
	}
	
}
