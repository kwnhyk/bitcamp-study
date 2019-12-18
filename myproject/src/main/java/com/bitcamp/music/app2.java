package com.bitcamp.music;

import java.util.Scanner;

public class app2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String artist,age,born,genre;
		System.out.println("아티스트명입력");
		artist = scan.nextLine();
		System.out.println("나이입력");
		age = scan.nextLine();
		System.out.println("출신지입력");
		born = scan.nextLine();
		System.out.println("장르입력");
		genre = scan.nextLine();
		System.out.println("아티스트: " + artist);
		System.out.println("나이:" + age);
		System.out.println("출신:" + born);
		System.out.println("장르:" + genre);
		scan.close();
	}

}
