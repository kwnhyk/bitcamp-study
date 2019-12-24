package com.eomcs.lmsst.handler;

import java.sql.Date;
import java.util.Scanner;

import com.eomcs.lmsst.domain.Board;

public class BoardHandler {
  
  
  static final int BOARD_SIZE = 100;
    Board[] boards = new Board[BOARD_SIZE];
    int boardCount = 0;
  public static Scanner keyboard;
  
  public  static void listBoard(BoardHandler boardHandler) {
    for (int i = 0; i < boardHandler.boardCount; i++) {
      Board b = boardHandler.boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }

public static    void addBoard(BoardHandler boardHandler) {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;
    
   boardHandler.boards[boardHandler.boardCount++] = board;
    System.out.println("저장하였습니다.");
  }
 public static  void detailBoard(BoardHandler boardHandler) {
	 System.out.print("게시물 번호? ");
	 int no = keyboard.nextInt();
	 keyboard.nextLine();
	 Board board = null;
	 for(int i = 0; i < boardHandler.boardCount; i++) {
		 if(boardHandler.boards[i].no == no) {
			 board = boardHandler.boards[i];
			 break;
		 }
	 }
	 if (board ==null) {
		 System.out.println("게시물 번호가 유효하지 않습니다.");
		return;
	 }
	 
	 
	 System.out.printf("번호: %d\n", board.no);
	 System.out.printf("제목: %s\n",board.title);
	 System.out.printf("등록일: %s\n",board.date);
	 System.out.printf("조회수: %d\n",board.viewCount);
	 
 }
}
