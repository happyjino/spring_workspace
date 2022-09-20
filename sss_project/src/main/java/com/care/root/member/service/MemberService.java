package com.care.root.member.service;

import org.springframework.ui.Model;

public interface MemberService {
	public int login_chk(String id, String pwd);
	public void memberInfo(Model model);

}
