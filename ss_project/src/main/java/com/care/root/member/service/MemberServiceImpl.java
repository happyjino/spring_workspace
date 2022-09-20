package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mm;
	BCryptPasswordEncoder e = new BCryptPasswordEncoder();
	
	public int login_chk(String id, String pwd) {
		MemberDTO member = mm.getMember(id);
		int result = -1;
		if(member != null) {
			if(e.matches(pwd, member.getPwd()) || pwd.contentEquals(member.getPwd())) {
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
		System.out.println("변경 전 : " + dto.getPwd());
		System.out.println("변경 후 : " + e.encode(dto.getPwd()));
		dto.setPwd(e.encode(dto.getPwd()));
		mm.register(dto);
	}
}