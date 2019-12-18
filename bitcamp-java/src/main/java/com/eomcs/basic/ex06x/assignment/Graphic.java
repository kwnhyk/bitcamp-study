package com.eomcs.basic.ex06x.assignment;

public class Graphic {


	static void drawLine(int len) {
    	int x =0;
    	
    	
    	while(x++ < len) {
    		System.out.print("*");
    	}
	}
    static void drawLine(int len ,char ch) {
    	
    	int x =0;
    	while(x++< len) {
    		System.out.print(ch);
    	}
    }
}

