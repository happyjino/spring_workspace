package com.care.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
//		STBean stb = new STBean();
		
		String path = "classpath:applicationST2.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb01", STBean.class);
		
//		stb.setSt(new Student());
		stb.setName("ȫ�浿");
		stb.setAge(20);
		
		stb.printName();
		stb.printAge();
	}
}
