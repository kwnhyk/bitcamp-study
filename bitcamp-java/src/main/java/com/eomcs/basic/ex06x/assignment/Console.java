package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Console {
	 @Deprecated
	  static int inputInt() {
		  return inputInt("밑변 길이?");
	  }
	
	  static int inputInt(String ch) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.printf(ch);
	    	int width = sc.nextInt();
	    //	sc.close();
	    	return width;
	    	}
	
	

}
