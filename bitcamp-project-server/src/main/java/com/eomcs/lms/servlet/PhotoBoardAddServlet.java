package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;

import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardAddServlet implements Servlet {
PhotoBoardDao photoboardDao;
	
	public PhotoBoardAddServlet(PhotoBoardDao photoboardDao) {
		this.photoboardDao = photoboardDao;
		
		
	}
	@Override
	public void service(Scanner in, PrintStream out) throws Exception {
		PhotoBoard photoBoard = new PhotoBoard();
		out.println("제목?\n!{}!");
		photoBoard.setTitle(in.nextLine());
		if(photoboardDao.insert(photoBoard)>0 ) {//등록했다면
			out.println("새 게시물을 등록했습니다");
			
		}
		else
		{
			out.println("등록 실패");
			
		}
		
	}
}
