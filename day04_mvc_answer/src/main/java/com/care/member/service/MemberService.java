package com.care.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.member.dao.MemberDAO;
import com.care.member.dto.MemberDTO;

@Service
public class MemberService {
	@Autowired MemberDAO dao;
	
	public void register(MemberDTO dto) {
		System.out.println("저장 서비스 연결");
		// 중간중간 출력하는 문구를 넣어서 어디까지 진행이 됐는지 알 수 있게 한다!
		dao.register(dto);
	}
	
	public ArrayList<MemberDTO> getList() {
		System.out.println("불러오기 서비스 연결");
		ArrayList<MemberDTO> list = dao.getList();
		
		return list;
	}

}
