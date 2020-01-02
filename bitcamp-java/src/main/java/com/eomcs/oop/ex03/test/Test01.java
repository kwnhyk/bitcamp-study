package com.eomcs.oop.ex03.test;

import com.eomcs.oop.ex03.test.sub.A;

class Score {
  static int count;
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  static void increase() {
    Score.count++;
  }
  
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;

  }
}


public class Test01 {
  public static void main(String[] args) {
    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    Score.increase();

    Score s2 = new Score();
    Score.count = 2;
    s2.name = "홍길동";
    s2.kor = 90;
    s2.eng = 80;
    s2.math = 70;
    s2.compute();
    Score.increase();
    
  }
}
