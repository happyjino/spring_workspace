package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int login_chk(String id, String pwd);
	public ArrayList<MemberDTO> getAllMember();
	public MemberDTO getMember(String id);
	public void register(MemberDTO dto);
	public void delAccount(String id);
	public void modify(MemberDTO dto);
	public String getMsg(String msg, String url);
	public String testMsg(MemberDTO dto);
}
