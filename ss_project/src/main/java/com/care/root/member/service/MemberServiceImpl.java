package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

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
	
	public void delAccount(String id) {
		mm.delAccount(id);
	}
	public void modify(MemberDTO dto) {
		mm.update(dto);
	}
	public String getMsg(String msg, String url) {
		String scr = null;
		scr = "<script>alert('"+msg+"');";
		scr += "location.href='"+url+"';</script>";
		return scr;
	}
	public String testMsg(MemberDTO dto) {
		int res = 1;
		String msg = null, url = null;
		if(res == 1) {
			msg = "수정 성공입니다!!!";
			url = "/root/member/info?id="+dto.getId();
		}else {
			msg = "문제 발생!!!!";
			url = "/root/member/modify?id="+dto.getId();
		}
		return getMsg(msg,url);
	}
	public void keepLogin(String id) {
		mm.keepLogin(id);
	}
	
	public void notKeepLogin(String id) {
		mm.notKeepLogin(id);
	}
	
	public MemberDTO getAutoLogin(String autoLogin) {
		
		return mm.getAutoLogin(autoLogin);
	}
}
