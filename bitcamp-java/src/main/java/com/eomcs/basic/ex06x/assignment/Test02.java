package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        
    int width	= inputInt();
    int line = 0;
        while(line++ < width) {
        	drawLine(line);
        	System.out.println();
        }
    	
    			
    		
        
    		line--;
    		
    		while(--line > 0) {
    		drawLine(line);
    		System.out.println();
    		}	
}
    static int inputInt() {
    	Scanner sc = new Scanner(System.in);
    	System.out.printf("밑변길이?");
    	int width = sc.nextInt();
    	sc.close();
    	return width;
    	}
    static void drawLine(int len) {
    	int x =0;
    	while(x++ < len) {
    		System.out.print("*");
    	}
}
}