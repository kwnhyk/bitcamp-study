package com.eomcs.basic.ex07x.test;

public class test21 {


	static class Member{
		int no;
		String name;
		int birthYear;
		char gender;
		float height;
		float weight;
		boolean personalTraining;

	}


	public static void main(String[] args) {
		Member m1;
		m1 = createMember();//주소 받기
		setMemberValues(m1);//주소 넘기기
		printMember(m1);//
	}

	static Member createMember() {
		Member m = new Member();
		return m;
	}
	static void setMemberValues(Member m) {
		m.no =100;
		m.name = "홀길동";
		m.birthYear = 2000;
	}
	static void printMember(Member m) {
		System.out.println(m.no);
		System.out.println(m.name);
		System.out.println(m.birthYear);
	}



}