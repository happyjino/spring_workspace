package com.care.root.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

public class AutoLogin extends HandlerInterceptorAdapter{
	
	@Autowired MemberService ms;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Cookie cook = WebUtils.getCookie(request, "loginCookie");
		System.out.println("오토로그인 체크");
		if(cook != null) {
			System.out.println("쿠키있음");
			MemberDTO dto = ms.getAutoLogin(cook.getValue());
			if(dto != null) {
				System.out.println("세션 만들기");
				request.getSession().setAttribute("login", dto.getId());
			}
		}
		
		return true;
	}
	
}
