package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String path="classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		PrintBean psb = ctx.getBean("pb01", PrintBean.class );
		
		System.out.print("ют╥б : ");
		String name = scan.next();
		
		psb.setPrint(name);
		
		psb.printString();
		
	}

}
