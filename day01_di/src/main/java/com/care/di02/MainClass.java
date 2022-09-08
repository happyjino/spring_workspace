package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean stb = new STBean();
		
		// classpath 는 리소스 경로이다!(src/main/resources)
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb01", STBean.class );
		
//		stb.setName("홍길동");
//		stb.setAge(20);
		//stb.setSt(new Student());
		
		stb.namePrint();
		stb.agePrint();
	}
}
