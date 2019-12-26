package com.eomcs.oop.ex02.study;

public class Test02 {
public static void main(String[] args) {
	
	
	Calculator s1 = new Calculator();
	Calculator s2 = new Calculator();
	 s1.plus(2);
	 s1.plus(3);
	 s2.minus(1);
	 s2.multiple(7);
	 s1.devide(3);
	
	System.out.printf("결과:%d\n",s1.result);
			
	
}
	
	


}
