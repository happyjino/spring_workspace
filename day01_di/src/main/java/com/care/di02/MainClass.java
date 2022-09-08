package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean stb = new STBean();
		
		// classpath �� ���ҽ� ����̴�!(src/main/resources)
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		STBean stb = ctx.getBean("stb01", STBean.class );
		
//		stb.setName("ȫ�浿");
//		stb.setAge(20);
		//stb.setSt(new Student());
		
		stb.namePrint();
		stb.agePrint();
	}
}
