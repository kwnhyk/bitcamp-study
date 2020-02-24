package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardListServlet implements Servlet {

	
PhotoBoardDao photoBoardDao;
	LessonDao lessonDao;
	public PhotoBoardListServlet(PhotoBoardDao photoBoardDao,LessonDao lessonDao) {
		this.photoBoardDao = photoBoardDao;
		this.lessonDao = lessonDao;
		
		
	}
	
	@Override
	public void service(Scanner in, PrintStream out) throws Exception {
		out.println("수업번호?");
		out.println("!{}!");
		out.flush();
		
		int lessonNo = Integer.parseInt(in.nextLine());
		Lesson lesson = lessonDao.findByNo(lessonNo);
		
		if(lesson == null) {
			
			out.println("해당 번호의 수업이 없습니다");
			return;
		}
		out.printf("수업명:%s\n", lesson.getTitle());
		
		out.println("---------------------------");
		List<PhotoBoard> photos = photoBoardDao.findAllByLessonNo(lessonNo);
		
		 for (PhotoBoard b : photos) {
		        out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getCreatedDate(),
		            b.getViewCount());
		      }
		
		
		
	}
	

	
	
	
}
