package com.care.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.member.dao.MemberDAO;

@Service
public class MemberService {
	@Autowired MemberDAO dao;
	
	public void make() {
		
	}
}
