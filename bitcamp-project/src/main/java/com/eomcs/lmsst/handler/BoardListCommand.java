package com.eomcs.lmsst.handler;

import java.util.Iterator;
import java.util.List;

import com.eomcs.lmsst.domain.Board;

public class BoardListCommand implements Command{
	 
	  List<Board> boardList;
	
	  
	public BoardListCommand(List<Board> list) {
		 this.boardList = list;
	}

	
	 
	  @Override
	public void execute() {
	    // BoardList 에게 값을 꺼내는 일을 해줄 Iterator 객체를 달라고 한다 
		  Iterator<Board> iterator = boardList.iterator();
	    while(iterator.hasNext()) {
	    Board b = iterator.next();
	      System.out.printf("%d, %s, %s, %d\n", 
	          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
	    }
	  }

}
