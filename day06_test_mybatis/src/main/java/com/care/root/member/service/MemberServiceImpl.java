package com.care.root.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired MemberDAO dao;
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	};
}
