package com.eomcs.basic.ex04;



public class Exam71{
	int instanceVar; //인스턴스  필드
	static int classVar; //클래스 필드 = 스태틱 필드
    public static void main(String[] args){
    int local; //로컬 변수
    int local2;
    
    }
    
    static void m1() {
    	int local;
    	//메소드 블록이 다르면 변수 다름
    	//같은이름 변수 선언가능
    	//다른메소드 블록에 있는 변수를 사용 할 수 없다
    	//local2 = 100; //컴파일오류
    	//같은 static 멤버는 가능
    	classVar = 100;
    }
    void m2() {
    	int local;
    	classVar = 200;
    }
    }
