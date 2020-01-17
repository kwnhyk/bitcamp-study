package com.eomcs.oop.ex11.a;

public class Exam0410 {

	
		
	interface A{
			
			void print() ;
		
	}
		
public static void main(String[] args) {
	class My implements A{
		@Override
		public void print() {
			System.out.println("hello");
			
		}
	}

	final A obj = new My();
	obj.print();


}
}

