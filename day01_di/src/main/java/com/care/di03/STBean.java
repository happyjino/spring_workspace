package com.care.di03;

public class STBean {
	private int age;
	private String name;
	private Student st;
	
	public void printName() {
		st.namePrint(name);
	}
	
	public void printAge() {
		st.agePrint(age);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	
	
}
