package com.eomcs.oop.ex06.c;

public class C {
	//private 접근범위
	//현재클래스
    private void m1() {}
    //protected접근범위
    //현재클래스 +같은패키지소속 클래스+서브클래스
    protected void m2() {}
    //default 접근범위
   //현재클래스+같은패키지 소속 클래스
    void m3() {}
    public void m4() {}
    //모두
}
