package com.care.member.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.member.dto.MemberDTO;

@Repository
public class MemberDAO {
	ArrayList<MemberDTO> DB;
	
	public MemberDAO() {
		DB = new ArrayList<MemberDTO>();
	}
	
	public void register(MemberDTO dto) {
		DB.add(dto);
	}
	
	public ArrayList<MemberDTO> getList() {
		return DB;
	}
}
