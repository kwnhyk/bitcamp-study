package com.eomcs.oop.ex11.a;
import java.util.ArrayList;
import java.util.List;

public class Exam240{
	public static void main(String[] args) {
		Musics m1 = new Musics();
		m1.add("aaa.mp3");
	
		Musics.Player p1 = m1.new Player();
		Musics.Player p2 = m1.new Player();
		
		p1.play();
		p2.play();
		Musics m2 = new Musics();
		m2.add("xxx.mp3");
		
	}
	
}
	class Musics{
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
			
		
	}
	
	
	
	
	
