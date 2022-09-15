package com.care.root;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.member.controller.MemberController;
import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {
		"classpath:testMember.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class TestMember {
	@Autowired MemberController mc;
	@Test
	public void testMc() {
		assertNotNull(mc);
	}
	
	@Autowired MemberService ms;
	@Test
	public void testMs() {
		assertNotNull(ms);
		/*
		MemberDTO dto = new MemberDTO();
		dto.setId(333);
		dto.setName("홍길동333");
		
		ms.insertMember(dto);
		*/
	}
	
	@Autowired MemberDAO dao;
	@Test
	public void testDao() {
		assertNotNull(dao);
		
		
	}
	
}
