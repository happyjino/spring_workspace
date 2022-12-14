package com.care.root.mybatis.member;

import java.util.ArrayList;

import com.care.root.member.dto.MemberDTO;

public interface MemberMapper {
	public MemberDTO getMember(String id);
	public ArrayList<MemberDTO> getAllMember();
	public void register(MemberDTO dto);
	public void delAccount(String id);
	public void update(MemberDTO dto);
	public void keepLogin(String id);
	public void notKeepLogin(String id);
	public MemberDTO getAutoLogin(String autoLogin);
}
