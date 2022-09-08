package com.care.mvc01;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	public MemberDAO() {
		System.out.println("DAO 생성자");
	}
	public void index() {
		System.out.println("데이터베이스 연산합니다.");
	}
}
