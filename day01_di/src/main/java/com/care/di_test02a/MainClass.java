package com.care.di_test02a;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path="classpath:application_test02a.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass sc = ctx.getBean("sc01", SaveClass.class);
		sc.setNum1(10); sc.setOp("-"); sc.setNum2(20);
		
		sc.operationClass();
		sc.printClass();

	}

}
