package com.eomcs.lms;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class app2 {


    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String no,name,email,password,photo,number;
      SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd ");
      
      		
      Date time = new Date();
      		
      String time1 = format1.format(time);
     
     
      
      System.out.print("번호?");
       no = keyboard.nextLine();
       System.out.print("이름?");
       name = keyboard.nextLine();
       System.out.print("이메일?");
       email = keyboard.nextLine();

       System.out.print("암호?");
       password = keyboard.nextLine();
      
       System.out.print("사진?");
       photo = keyboard.nextLine();
       
       System.out.print("전화?");
       number = keyboard.nextLine();
       
       

       System.out.println();	



       System.out.printf("번호 : %s\n" ,no);
       System.out.printf("이름:%s\n" , name);
       System.out.printf("이메일:%s",email);
       System.out.printf("암호:%s\n" , password);
       System.out.printf("사진:%s\n" ,photo);
       System.out.printf("전화:%s \n" , number);
       System.out.printf("가입일:%s \n" , time1 );
   
       
       
       keyboard.close();

      
    }
}