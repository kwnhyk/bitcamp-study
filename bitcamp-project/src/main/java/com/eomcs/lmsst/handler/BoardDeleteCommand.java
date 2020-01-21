package com.eomcs.lmsst.handler;

import java.util.List;

import com.eomcs.lmsst.domain.Board;
import com.eomcs.lmsst.util.Prompt;

public class BoardDeleteCommand implements Command {


	  List<Board> boardList;
	  Prompt prompt;
	  
	  
	  public BoardDeleteCommand(Prompt prompt,List<Board> list) {
	    this.prompt = prompt;
	    this.boardList = list;
	  }
	  
	  @Override
	public void execute() {
		    System.out.print("번호? ");
		    
		    int index = indexOfBoard(prompt.inputInt("번호?"));
		    
		    
		    if (index ==-1) {
		      System.out.println("게시글 인덱스가 유효하지 않습니다.");
		      return;
		    }

		    
		    this.boardList.remove(index);
		    
		    System.out.println("게시글을 삭제했습니다.");
		  }
	  private int indexOfBoard(int no) {
		  for(int i = 0; i <this.boardList.size(); i++) {
			  if(this.boardList.get(i).getNo() == no) {
				  return i;
			  }
		  }
		  return -1;
	  }
}
