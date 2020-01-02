package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;


public class Test01 {

  static class Grades{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average; 
  }

  static final int SIZE = 3;

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    Grades[] grades = new Grades[SIZE];

    for (int i = 0; i < grades.length; i++) {
      Grades g = new Grades();
      System.out.print("입력: ");
      g.name = keyScan.next();
      g.kor = keyScan.nextInt();
      g.eng = keyScan.nextInt();
      g.math = keyScan.nextInt();
      g.sum = g.kor + g.eng + g.math;
      g.average = g.sum / 3.0f;
      grades[i] = g;
    }
    System.out.println("--------------------------");

    for(int i = 0; i < grades.length; i++) {
      Grades g = new Grades();
      g = grades[i];
      System.out.printf("%s %d %d %d %d %s\n", 
          g.name, g.kor, g.eng, g.math, g.sum, g.average);
    }
    keyScan.close();
  }
}
