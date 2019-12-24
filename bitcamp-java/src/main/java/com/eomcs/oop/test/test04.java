package com.eomcs.oop.test;

public class test04 {

	
	
	
	
	public static void main(String[] args) {

		 class Member{
			int no;
			String name;
			int birthYear;
			char gender;
			float height;
			float weight;
			boolean personalTraining;
			
		}

		//-Member 설계도에 따라 메모리를 준비시키는 명령이다.
	//	이 명령을 통해 생성된 메모리를 인스턴스 보통은 객체

	
	

	Member m1;
	m1 = new Member();
	
	m1.no = 100;
	System.out.println(m1);
	System.out.println(m1.no);
	Member m2 = m1;
	System.out.println(m2.no);
	
	m1.no = 200;
			System.out.println(m2.no);

	
}

}
