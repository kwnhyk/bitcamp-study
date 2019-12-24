package com.eomcs.basic.ex03;



//# 부동소수점의 리터럴 - 2진수로 변경된 것을 확인하기
//- 자바가 부동소수점을 다룰 때 IEEE 754 규칙에 따라 2진수로 변환하는 것을 확인해 보자.

public class Exam35 {
  public static void main(String[] args) {
    System.out.println(12.375f);
    System.out.println(54345.66f);
    System.out.println(11.23456f);

    System.out.println(54356.66f+11.23456f);//각각의 수는 유효자릿수이지만 계산결과는 
  //유효자릿수를 넘어가기 떄문에 값이 구겨진다
  //=>이렇게 작은 부동소수점인 경우도 유효자릿수를 쉽게 넘어가기 떄문에 그래서 자바는 기본으로 8바이트 
  //메모리기본
  }
}

//## 실습
//1) 컴파일하기
//- $ javac -d bin/main -encoding UTF-8 src/main/java/com/ohoracs/basic/ex03/Exam35.java
//
//2) 클래스 파일로 부동소수점 값 확인하기
//- Exam35.class 파일을 hexdump 플러그인으로 출력한다.
//- 12.375의 2진수 값인 0100_0001_0100_0110_0000_0000_0000_0000을 찾아본다.
//  보통 에디터에서는 2진수를 16진수로 바꿔 보여주기 때문에 16진수 값 0x41460000을 찾아보라!
//