package com.eomcs.oop.ex02.study;

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  public void calculate() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}
