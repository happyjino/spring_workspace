package com.care.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired MemberDAO dao;
	public MemberService() {
		System.out.println("서비스 생성자");
	}
	public void index() {
		System.out.println("service index");
		System.out.println("특정 연산을 합니다.");
		// dao = new MemberDAO();
		dao.index();
	}
}
