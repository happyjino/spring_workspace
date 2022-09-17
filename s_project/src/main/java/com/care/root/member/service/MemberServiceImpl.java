package com.care.root.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper mm;
	public MemberDTO login_chk(String id) {
		MemberDTO checkDTO = mm.getCheckDTO(id);
		System.out.println("1 : " + id);
		return checkDTO;
	}
}
