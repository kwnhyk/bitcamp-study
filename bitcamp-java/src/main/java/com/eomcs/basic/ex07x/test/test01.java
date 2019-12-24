package com.eomcs.basic.ex07x.test;

public class test01 {


	
	
	
	public static void main(String[] args) {

		int i ;
		i = 100;
		Member m1;
		m1 = new Member();
		
		m1.no = 100;
		
//		m1.no = 100 ;
	
		
	}
		//new Member()
		//-Member 설계도에 따라 메모리를 준비시키는 명령이다.
	//	이 명령을 통해 생성된 메모리를 인스턴스 보통은 객체

	
	
	static class Member{
		int no;
		String name;
		int birthYear;
		char gender;
		float height;
		float weight;
		boolean personalTraining;
		
	}
	
	

	
	
	

}
