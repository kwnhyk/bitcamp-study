// 산술 연산자 : 명시적 형변환
package com.eomcs.basic.ex05x;

public class Exam01_7 {
    public static void main(String[] args) {
        byte b = (byte)256;
        // 0000 0000 0000 0000 0000 0001 0000 0000
        // 4바이트 중에서 앞의 3바이트가 짤리고 뒤의 1바이트가 
        // b에 저장된다.
        System.out.println(b); // 0
    }
    
    //결론 큰메모리의 값을 작은 메모리에 넣으려고 형변환을 사용하기도 하는데 다만 형변환하더라도 값이 잘리지 않을때만 하라
    //형변환하더라도 값이 소실되지 않을 때만 명시적 형변환을 지시하라!
}
