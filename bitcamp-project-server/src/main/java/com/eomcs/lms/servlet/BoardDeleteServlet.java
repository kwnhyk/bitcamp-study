package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;

import com.eomcs.lms.dao.BoardDao;

public class BoardDeleteServlet implements Servlet {

	BoardDao boardDao;
	
	public BoardDeleteServlet(BoardDao boardDao) {
		this.boardDao = boardDao;
		
		
	}
	@Override
	public void service(Scanner in, PrintStream out) throws Exception {
	    
	        out.println("번호?\n!{}!");
	        out.flush();
	        int no = Integer.parseInt(in.nextLine());
	       
	    

	        if (boardDao.delete(no) > 0) { // 삭제했다면
	          out.println("삭제완료");

	        } else {
	        
	          out.println("해당 번호의 게시물이 없습니다.");
	        }
	      
	    }
	

	
}
