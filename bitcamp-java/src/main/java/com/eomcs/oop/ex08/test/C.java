package com.eomcs.oop.ex08.test;


public class C {
//스태틱 멤버는 인스턴스 없이 호출한다.
//즉 스테틱 멤버(static context)에서는 this 를 사용할 수 없다.



    static void m1(){}//클래스 메서드 =스태틱 메서드
//Object obj = this; //this 변수가 없다
int m2() {
    Object obj = this;
    return 0;}//인스턴스 메서드 = 논스태틱 메서드
//initializer block
static {
  //  Object obj = this;//this변수가 없다.
}//스태틱 블록
{
    Object obj =this;//OK
}//인스턴스 블록


//constructor
C(){
Object obj = this;
}
//스태틱 멤버는 인스턴스 없이 호출한다.
//즉 스테틱 멤버(static context)에서는 this 를 사용할 수 없다.



}