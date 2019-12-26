package com.eomcs.oop.ex01;

//# 클래스 사용 - import III
//
public class Exam0460 {
  public static void main(String[] args) {
	  java.io.File obj3;
    // 다음 클래스는 자바에서 기본으로 제공하는 클래스이다.
    // 패키지명을 명시하지 않아도 컴파일 오류가 발생하지 않는다.
    Integer obj1;
    System obj2;

    // 다음 클래스도 자바에서 기본으로 제공하는 클래스이다.
    // 그런데 위의 클래스들과 달리 패키지명을 명시하지 않으면 
    // 컴파일 오류가 발생한다.
    File obj3; // 컴파일 오류!
  }
}

// 이유?
// - java.lang 패키지에 소속된 클래스를 사용할 때는 
//   패키지 이름을 명시하지 않는다.
// - 왜냐하면 java.lang 패키지의 클래스들은 가장 많이 사용하는 
//   기본 클래스이기 때문이다.
// - 그 외의 모든 패키지 클래스들은 반드시 패키지명을 지정해야 한다.
// - 지정하기 싫으면 import 명령을 사용하여 소스 파일 서두에 선언해야 한다.
//


