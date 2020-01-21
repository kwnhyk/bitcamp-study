package com.eomcs.lmsst.handler;

import java.util.Iterator;
import java.util.List;

import com.eomcs.lmsst.domain.Lesson;

public class LessonListCommand implements Command {


	  List<Lesson> lessonList;
	
	  
	  public LessonListCommand(List<Lesson> list) {
	  
	    this.lessonList = list;
	  }
	  @Override
	public void execute() {
		    // 수업 객체 목록을 복사 받을 배열을 준비하고, toArray()를 실행한다.
		    // toArray()의 리턴 값은 파라미터로 넘겨준 배열의 주소이다.
			
			/*  for(int i =0; i <lessonList.size();i++) {
				  Lesson l = lessonList.get(i);
				  */
			  Iterator<Lesson> iterator = lessonList.iterator();
			  while(iterator.hasNext()) {
				Lesson l =  iterator.next();
			  
		      System.out.printf("%d, %s, %s ~ %s, %d\n",
		          l.getNo(), l.getTitle(), 
		          l.getStartDate(), l.getEndDate(), l.getTotalHours());
		    }
		  }
}
