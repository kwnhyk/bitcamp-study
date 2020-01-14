// Wrapper 클래스 - auto-boxing/auto-unboxing 응용
package com.eomcs.corelib.ex01;

public class Exam0223 {
	static class Member{
		String name;
		String tel;
		
		
		@Override
	public String toString() {
			return name +","  + tel;
		}
	}

	static void print(int i) {
		System.out.print("정수:");
		System.out.println(i);
	}
	static void print(Member m) {
		System.out.print("회원:");
		System.out.println(m);
	}
  public static void main(String[] args) {
    int v1 = 100;
    Member v2 = new Member();
v2.name = "홍길동";
v2.tel = "010-1111-2222";
print(100);
print(v2);
  }

    
}






