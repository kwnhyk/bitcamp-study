package com.eomcs.oop.ex11.a;
import java.util.ArrayList;
import java.util.List;

public class Exam241{
	public static void main(String[] args) {
		Musics2 m1 = new Musics2();
		m1.add("aaa.mp3");
	
		Musics2.Player p1 = m1.createPlayer();
		Musics2.Player p2 = m1.createPlayer();
		
		p1.play();
		p2.play();
		Musics m2 = new Musics();
		m2.add("xxx.mp3");
		Musics.Player p3 = m2.new Player();
		p3.play();
		
	}
	
}
	class Musics2{
		class Player{
			
			
			public void play() {
				for(final String song :songs) {
					System.out.println(song);
				}
				System.out.println("-------------------");
			}
		}
		List<String> songs = new ArrayList<>();
		
		public void add(String song) {
			songs.add(song);
			
		}
		public void delete(int index) {
			songs.remove(index);
			
			
		}
		public Player createPlayer() {
			return new Player();
			
		}
			
		
	}
	
	
	
	
	
