package com.eomcs.basic.ex03;



//# 문자의 리터럴 
//- 작은 따옴표 ''를 사용하여 문자를 표현한다.

public class Exam41 {
  public static void main(String[] args) {

    //작은 따옴표를 사용하여 문자를 표현한다.
    System.out.println('A'); 
    System.out.println('가'); 
    
    //키보드로 직접 입력할 수 없는 문자를 표현할 때는 그 문자에 대해 정의된 값을 지정한다.
    //문자에 대해 정의된 값을 '문자 코드(character code)'라 부른다.
    //코드값 앞에 \ u 문자를 붙인다. 
    
    //사람을 뜻하는 '인'이라는 한자를 출력해 보자.
    System.out.println('\u4eba');
    //키보드로 입력 가능한 문자도 문자 코드로 지정할 수 있다.   [\ u ][UCS-2 코드]
    System.out.println('\u0041');//A
    System.out.println('\uac00'); 
    System.out.println('\u0030');//0문자
    System.out.println('\u0025');//%문자
    System.out.println('\uac00'); //가
  }
}