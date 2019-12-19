
package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 { 
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registeredDate;
    }

    final int SIZE = 100;

    // Member 인스턴스의 주소를 저장할 레퍼런스 배열을 준비한다.
    Member[] members = new Member[SIZE];

    // Member 인스턴스를 생성하여 레퍼런스 배열에 저장한다.
  //  for (int i = 0; i < SIZE; i++) {
   //   members[i] = new Member();
  //  }
    //
    int count = 0;

    for (int i = 0; i < SIZE; i++) {
      Member member = new Member();
      
      count++;

      System.out.print("번호? ");
      member.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("이름? ");
      member.name = keyboard.nextLine();

      System.out.print("이메일? ");
      member.email = keyboard.nextLine();

      System.out.print("암호? ");
      member.password = keyboard.nextLine();

      System.out.print("사진? ");
      member.photo = keyboard.nextLine();

      System.out.print("전화? ");
      member.tel = keyboard.nextLine();

      member.registeredDate = new Date(System.currentTimeMillis());

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      
      
      members[i] =  member;
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      Member member = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n", 
          member.no, member.name, member.email, 
          member.tel, member.registeredDate);
    }
  }
}
/*package com.eomcs.lms;


import java.sql.Date;
import java.util.Scanner;

public class App2 {
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
*/