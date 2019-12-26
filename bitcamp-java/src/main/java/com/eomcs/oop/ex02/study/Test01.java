package com.eomcs.oop.ex02.study;

public class Test01 {

	public static void main(String[] args) {
		Score s = new Score();
		s.name = "홍길동";
		s.k=100;
		s.e =90;
		s.m=85;
		
		
		s.calculator();
		System.out.printf("%d\n",s.sum);
		System.out.printf("%f",s.avg);

	
}
}
