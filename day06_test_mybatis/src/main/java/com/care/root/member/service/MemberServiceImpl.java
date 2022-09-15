package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired MemberDAO dao;
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	};
	public void memberView(Model model) {
		ArrayList<MemberDTO> list = dao.getMember();
		model.addAttribute("list", list);
	}
}
