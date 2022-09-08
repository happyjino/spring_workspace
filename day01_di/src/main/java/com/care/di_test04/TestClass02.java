package com.care.di_test04;

public class TestClass02 implements Car{
	// interface 사용하지 않을 경우 main, sub, xml 모두 다 수정해야 한다! 불편...
	public void speed() {
		System.out.println("새로운 기능입니다.");
	}
	
}
