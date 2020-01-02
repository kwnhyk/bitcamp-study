package com.eomcs.oop.ex02.study;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    if(a == 0 & b < 45) {
      a = a + 23;
      b = b + 15;
    } else if(b < 45) {
        a = a - 1;
        b = b + 15;
    } else {
        b = b - 45;
    }
        System.out.printf("%s %s",a,b);
    }
}