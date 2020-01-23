package com.eomcs.oop.ex09.g;

public interface A {

	
	void m1();
	
	default void m2() {}
	
	
	static void m3() {
		System.out.println("인터페이스도 스태틱 메소드 가지기가능");
	}
	}
	
	

