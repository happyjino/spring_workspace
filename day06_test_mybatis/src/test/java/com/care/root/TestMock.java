package com.care.root;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import com.care.root.member.controller.MemberController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {
		"classpath:testMember.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class TestMock {
	@Autowired MemberController mc;
	MockMvc mock;
	
	
	@Before
	public void setUp() {
		System.out.println("---test실행전 실행---");
		mock = MockMvcBuilders.standaloneSetup(mc).build();
	}
	@Test
	public void testIndex() throws Exception{
		System.out.println("test index 실행");
		assertNull(null);
		mock.perform(get("/index"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("member/index"));
	}
	
	@Test
	@Transactional(transactionManager = "txMgr")
	public void testInsert() throws Exception{
		mock.perform(post("/insert").param("id", "789").param("name", "홍길동789"))
		.andExpect(status().is3xxRedirection());
		
	}
}
