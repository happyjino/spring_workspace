package com.care.root.member.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int login_chk(String id, String pwd);
	public void memberInfo(Model model);
	public void info(HttpSession session, String id);
	public void register_member(MemberDTO dto);
}
