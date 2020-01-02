package com.eomcs.oop.ex03.test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    do {
      int a = s.nextInt();
      int b = s.nextInt();
      System.out.println(a+b);
    }   while(s.hasNextLine());
  }
}