package com.eomcs.oop.ex08.test;


public class D extends Object{
int a;
}

class D2 extends D{
int b;


}
class D3 extends D{

int c;


}
class TestD{
public static void main(String[] args){
    D3 obj = new D3();//D3가 상속하고 있는 수퍼클래스의 인스턴스 변수까지 생성한다
    obj.c = 100;//D3의변수
    obj.b =100;//D2의 변수
    obj.a = 100; //D의변수       
}


}