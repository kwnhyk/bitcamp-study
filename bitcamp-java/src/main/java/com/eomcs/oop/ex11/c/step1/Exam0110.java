// 상수 변수를 활용하여 분류 코드를 다루기
package com.eomcs.oop.ex11.c.step1;

public class Exam0110 {
  public static void main(String[] args) {
    Product p = new Product();
    p.category = 10;//가전/TV
    p.name = "울트라비전 뷰";
    p.price = 2000000;
    
    Product p2 = new Product();
    p.category = 3;//컴퓨터/RAM
    p.name = "삼성모듈램 4GB";
    p.price = 80000;
    
    Product p3 = new Product();
    p.category = 101;//책/소설
    p.name = "토지";
    p.price = 18000;
  
    //제품의 카테고리는 정수 값으로 설정한다.
    //카테고리에 대해 정수 값을 지정해 놓고 값을 입력할 때 사용한다.
    //다만 숫자이기에 코드를 보는 것만으로 어떤 카테고리인지 알 수 없다.
    //그래서 보통 코드에 주석을 붙여 추가적인 정보를 제공한다.
    
  }
}
