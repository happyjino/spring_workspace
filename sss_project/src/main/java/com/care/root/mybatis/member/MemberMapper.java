package com.care.root.mybatis.member;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.care.root.member.dto.MemberDTO;

public interface MemberMapper {
	public MemberDTO getMember(String id);
	public ArrayList<MemberDTO> getAllMember();
	public void register_member(MemberDTO dto);
	public void delete(String id);
	public void modify(MemberDTO dto);
	public void autoLogin(String id);
}
