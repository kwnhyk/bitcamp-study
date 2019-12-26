package com.eomcs.oop.ex01.test;

import java.util.Scanner;

public class test1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		class Score{
			String name;
			int k,e,m;
			int sum;
			float avg;
			
			
		}
		
	Score arr[]  = new Score[3];
	for(int i=0; i<arr.length;i++ ) {
	System.out.print("입력:");
	Score s = new Score();
		
	s.name = keyboard.next();
	s.k =keyboard.nextInt();
	s.e = keyboard.nextInt();
	s.m = keyboard.nextInt();
	
	    arr[i] =s;
	}
	System.out.println("--------------------------");
	for(int i=0 ;i<arr.length;i++) {
		Score s = arr[i];
	   s.sum = s.k + s.e + s.m;
		    s.avg = s.sum / 3f;
	    System.out.printf("%s %d %d %d 합계=%d 평균=%f\n",s.name  ,s.k  ,  s.e,  s.m   ,
	    		s.sum,s.avg);
	}
}
}