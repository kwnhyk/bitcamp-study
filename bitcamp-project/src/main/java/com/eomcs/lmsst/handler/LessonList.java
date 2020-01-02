package com.eomcs.lmsst.handler;

import com.eomcs.lmsst.domain.Lesson;

public class LessonList {
	 Lesson[] list ;
	   int size = 0;
	   static final int LESSON_SIZE = 100;
	   
	   public LessonList(){
		   this.list = new Lesson[LESSON_SIZE];
	   }

	public Lesson[] toArray() {
		Lesson[] arr =new Lesson[this.size];
		for(int i=0;i<this.size;i++) {
			arr[i] = list[i];
		}
		return arr;
	}

	public void add(Lesson lesson) {
		  this.list[this.size++] = lesson;
		// TODO Auto-generated method stub
		
	}
	   
	   
}
