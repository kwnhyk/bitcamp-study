package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
    	
        int len = Console.inputInt();
        int line = 0;
        while(line++ < len) {
        Graphic.drawLine(line);
            System.out.println();
          
        }
    }
}
