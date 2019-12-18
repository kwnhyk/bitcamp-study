package com.eomcs.lms;


import java.sql.Date;
import java.util.Scanner;

public class app2 {
  static final int SIZE = 100;

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] pwd = new String[SIZE];
    String[] photo = new String[SIZE];
    String[] tel = new String[SIZE];
    Date[] date = new Date[SIZE];
    
    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      
      System.out.print("번호 ? ");
      no[i] = keyboard.nextInt();

      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("이름 ? ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일 ? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호 ? ");
      pwd[i] = keyboard.nextLine();

      System.out.print("사진 ? ");
      photo[i] = keyboard.nextLine();

      System.out.print("전화 ? ");
      tel[i] = keyboard.nextLine();

      date[i] =new  Date(System.currentTimeMillis());

      System.out.println();

      System.out.print("계속 입력하시겠습니까? (Y/N) ");
      String response = keyboard.nextLine();
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();

    System.out.println();

    for(int i = 0; i < count; i++) {
     
      System.out.printf("%d, %s ,%s  ,%s, %s\n", no[i], name[i], email[i], tel[i], date[i]);
    }

  }
}