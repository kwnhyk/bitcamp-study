package com.eomcs.oop.ex12;

public class Exam0310 {

	static interface Player{
		int play(int a, int b);
	}
	
	
	
	static void	MyPlay(Player p1){
		System.out.println(p1.play(100,200));
		
		
	}
	public static void main(String[] args) {
		
		MyPlay(new Player() {
			@Override
			public int play(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
			
		});
		
		MyPlay((a,b) -> a+b);
	}
}

