package com.care.di_test04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	
	public SubClass() { // 생성자
		String path = "classpath:car.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Car tc = ctx.getBean("tc01", Car.class);
		System.out.println("subclass 실행");
		tc.speed();
	}
	
}
