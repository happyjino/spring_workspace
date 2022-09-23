package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
			if(e.matches(pwd, member.getPwd()) || pwd.equals(member.getPwd())) {
				result = 0;
			}
		}
		
		return result;
	}
	
	public void memberInfo(Model model) {
		ArrayList<MemberDTO> list = mm.getAllMember();
		model.addAttribute("list", list);
	}
	public void info(HttpSession session, String id) {
		MemberDTO member = mm.getMember(id);
		session.setAttribute("member", member);
	}
	public void register_member(MemberDTO dto) {
		mm.register_member(dto);
	}
	public void delete(String id, HttpSession session) {
		
		mm.delete(id);
		session.invalidate();
		
	}
	public void modify(MemberDTO dto, HttpSession session) {
		String input_pwd = dto.getPwd();
		String member_pwd = ((MemberDTO)session.getAttribute("member")).getPwd();
		if(input_pwd.equals("") == false) {
			dto.setPwd(e.encode(input_pwd));
			System.out.println("비밀번호 입력");
		}else {
			dto.setPwd(member_pwd);
			System.out.println("비밀번호 입력 안함");
		}
		
		mm.modify(dto);
	}
	public void autoLogin(String id) {
		mm.autoLogin(id);
	}
	
	
}
