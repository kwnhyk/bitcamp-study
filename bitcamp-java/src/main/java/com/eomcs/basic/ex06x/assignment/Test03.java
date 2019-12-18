package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("밑변길이?");
		int width = sc.nextInt();
		if(width % 2 == 0)
			width--;
		int spaceSize = width >>1;
		int line = 0;
		while(line++ < width) {
			if(line % 2 ==0) {
				continue;
			}
			int count = 0;
			while(count++ < spaceSize) {
				System.out.print(" ");

			}
			spaceSize--;
			int x =0;
			while(x++ < line) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}