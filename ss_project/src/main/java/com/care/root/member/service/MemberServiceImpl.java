package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mm;
	
	public int login_chk(String id, String pwd) {
		MemberDTO member = mm.getMember(id);
		int result = -1;
		if(member != null) {
			if(pwd.equals(member.getPwd())) {
				result = 0;	
			}
		}
		return result;
	}
	
	public ArrayList<MemberDTO> getAllMember() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list = mm.getAllMember();
		return list;
	}
	
	public MemberDTO getMember(String id) {
		MemberDTO member = mm.getMember(id);
		
		return member;
	}
	
	public void register(MemberDTO dto) {
		mm.register(dto);
	}
}
