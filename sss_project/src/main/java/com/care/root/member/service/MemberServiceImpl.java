package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mm;
	public int login_chk(String id, String pwd) {
		MemberDTO member = mm.getMember(id);
		int result = -1;
		if(member != null) {
			if(id.equals(member.getId()) && pwd.equals(member.getPwd())) {
				result = 0;
			}
		}
		
		return result;
	}
	
	public void memberInfo(Model model) {
		ArrayList<MemberDTO> list = mm.getAllMember();
		model.addAttribute("list", list);
	}
}
