// 흐름 제어문 - for 반복문의 초기화 변수
package com.eomcs.basic.ex06x;

import java.util.Scanner;

public class Exam04_2 {
    public static void main(String[] args) {
        // for 문 안에 선언된 변수는 for 문을 나가는 순간 제거된다.
    	int num1,num2;
        int sum = 0;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("입력:");
    	num1 = scan.nextInt();
    	
    	num2 = scan.nextInt();
        for (int i =num1; i <= num2; ++i) {
        	sum +=i;
        }
        
        System.out.printf("%d에서 %d까지의 합은 %d입니다",num1,num2,sum);
    }
}