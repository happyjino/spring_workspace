package com.care.di_test03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String path = "classpath:application_test03.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		TestClass tc = ctx.getBean("tc", TestClass.class);
		System.out.println(tc.getIp());
		System.out.println(tc.getIp2());
		System.out.println(tc.getAge());
	}

}
