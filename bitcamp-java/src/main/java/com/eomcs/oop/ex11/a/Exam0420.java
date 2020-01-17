package com.eomcs.oop.ex11.a;

public class Exam0420 {

	
		
	interface A{
			
			void print() ;
		
	}
		
void m1(A obj) {
	
obj.print();



}
public static void main(String[] args) {
	Exam0420 r = new Exam0420();
			r.m1(()-> System.out.println("asd"));
}
}