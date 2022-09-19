package com.care.root.member.service;

import java.util.ArrayList;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int login_chk(String id, String pwd);
	public ArrayList<MemberDTO> getAllMember();
	public MemberDTO getMember(String id);
	public void register(MemberDTO dto);
}
