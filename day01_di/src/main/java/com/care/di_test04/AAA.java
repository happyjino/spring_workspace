package com.care.di_test04;

public class AAA implements Car{
	@Override
	public void speed() {
		System.out.println("aaaa");
		새로운기능();
	}
	
	private void 새로운기능() {
		System.out.println("aaa 새로운 기능 추가");
	}
}
