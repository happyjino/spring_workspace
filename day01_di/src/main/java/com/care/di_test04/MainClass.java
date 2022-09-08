package com.care.di_test04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String path = "classpath:car.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);

		Car tc = ctx.getBean("tc01", Car.class);
		System.out.println("main 실행");
		tc.speed();
		
		SubClass sc = new SubClass();
		// xml 파일의 경로만 바꿔줘도 된다!
	}
}
