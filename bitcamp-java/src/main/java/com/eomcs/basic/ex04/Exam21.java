package com.eomcs.basic.ex04;
public class Exam21{
    public static void main(String[] args){
     //정수 변수 - 메모리 크기
         byte b;//1바이트 크기를 갖는 메모리
         b = -128;
         b = 127;
         //2바이트 메모리 :-32768 ~ + 32767
         short s ; 
         s = -32768;
         s = 32767;//2
         //4바이트 메모리 약 -21억 ~ 21억
         int i ;//4
         i = -21_0000_0000;
            i = 21_0000_0000;
            //8바이트 메모리:약 -922경~ 922경

            long l ;//8
            l = 922_0000_0000_0000_0000L;
            l = -922_0000_0000_0000_0000L;
            System.out.println(l);
        
        

    }
}