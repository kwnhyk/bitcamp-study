package com.eomcs.lmsst;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.eomcs.lmsst.domain.Board;
import com.eomcs.lmsst.domain.Lesson;
import com.eomcs.lmsst.domain.Member;
import com.eomcs.lmsst.handler.BoardAddCommand;
import com.eomcs.lmsst.handler.BoardDeleteCommand;
import com.eomcs.lmsst.handler.BoardDetailCommand;
import com.eomcs.lmsst.handler.BoardListCommand;
import com.eomcs.lmsst.handler.BoardUpdateCommand;
import com.eomcs.lmsst.handler.Command;
import com.eomcs.lmsst.handler.ComputePlusCommand;
import com.eomcs.lmsst.handler.HelloCommand;
import com.eomcs.lmsst.handler.LessonAddCommand;
import com.eomcs.lmsst.handler.LessonDeleteCommand;
import com.eomcs.lmsst.handler.LessonDetailCommand;
import com.eomcs.lmsst.handler.LessonListCommand;
import com.eomcs.lmsst.handler.LessonUpdateCommand;
import com.eomcs.lmsst.handler.MemberAddCommand;
import com.eomcs.lmsst.handler.MemberDeleteCommand;
import com.eomcs.lmsst.handler.MemberDetailCommand;
import com.eomcs.lmsst.handler.MemberListCommand;
import com.eomcs.lmsst.handler.MemberUpdateCommand;
import com.eomcs.lmsst.util.Prompt;
import com.google.gson.Gson;

public class App2 {

	
		 static Scanner keyboard = new Scanner(System.in);

		  static Deque<String> commandStack = new ArrayDeque<>();
		  static Queue<String> commandQueue = new LinkedList<>();
		  static ArrayList<Lesson> lessonList = new ArrayList<>();
		  static LinkedList<Board> boardList = new LinkedList<>();
		  static LinkedList<Member> memberList = new LinkedList<>();

		  public static void main(String[] args) {
			loadLessonData();
			loadMemberData();
			loadBoardData();

		    Prompt prompt = new Prompt(keyboard);
		    HashMap<String, Command> commandMap = new HashMap<>();

		    commandMap.put("/board/add", new BoardAddCommand(prompt, boardList));
		    commandMap.put("/board/list", new BoardListCommand(boardList));
		    commandMap.put("/board/detail", new BoardDetailCommand(prompt, boardList));
		    commandMap.put("/board/update", new BoardUpdateCommand(prompt, boardList));
		    commandMap.put("/board/delete", new BoardDeleteCommand(prompt, boardList));

		    commandMap.put("/lesson/add", new LessonAddCommand(prompt, lessonList));
		    commandMap.put("/lesson/list", new LessonListCommand(lessonList));
		    commandMap.put("/lesson/detail", new LessonDetailCommand(prompt, lessonList));
		    commandMap.put("/lesson/update", new LessonUpdateCommand(prompt, lessonList));
		    commandMap.put("/lesson/delete", new LessonDeleteCommand(prompt, lessonList));

		    commandMap.put("/member/add", new MemberAddCommand(prompt, memberList));
		    commandMap.put("/member/list", new MemberListCommand(memberList));
		    commandMap.put("/member/detail", new MemberDetailCommand(prompt, memberList));
		    commandMap.put("/member/update", new MemberUpdateCommand(prompt, memberList));
		    commandMap.put("/member/delete", new MemberDeleteCommand(prompt, memberList));

		    commandMap.put("/hello", new HelloCommand(prompt));
		    commandMap.put("/compute/plus", new ComputePlusCommand(prompt));


		    String command;

		    while (true) {
		      System.out.print("\n명령> ");
		      command = keyboard.nextLine();

		      if (command.length() == 0)
		        continue;

		      if (command.equals("quit")) {
		        System.out.println("안녕!");
		        break;
		      } else if (command.equals("history")) {
		        printCommandHistory(commandStack.iterator());
		        continue;
		      } else if (command.equals("history2")) {
		        printCommandHistory(commandQueue.iterator());
		        continue;
		      }

		      commandStack.push(command);

		      commandQueue.offer(command);

		      Command commandHandler = commandMap.get(command);

		      if (commandHandler != null) {
		        try {
		          commandHandler.execute();
		        } catch (Exception e) {
		          System.out.printf("명령어 실행 중 오류 발생: %s\n", e.getMessage());
		        }
		      } else {
		        System.out.println("실행할 수 없는 명령입니다.");
		      }
		    }

		    keyboard.close();
		    saveLessonData();
		    saveBoardData();
		    saveMemberData();
		  }

		  // 이전에는 Stack에서 값을 꺼내는 방법과 Queue에서 값을 꺼내는 방법이 다르기 때문에
		  // printCommandHistory()와 printCommandHistory2() 메서드를 따로 정의했다.
		  // 이제 Stack과 Queue는 일관된 방식으로 값을 꺼내주는 Iterator가 있기 때문에
		  // 두 메서드를 하나로 합칠 수 있다.
		  // 파라미터로 Iterator를 받아서 처리하기만 하면 된다.
		  //
		  private static void printCommandHistory(Iterator<String> iterator) {
		    int count = 0;
		    while (iterator.hasNext()) {
		      System.out.println(iterator.next());
		      count++;

		      if ((count % 5) == 0) {
		        System.out.print(":");
		        String str = keyboard.nextLine();
		        if (str.equalsIgnoreCase("q")) {
		          break;
		        }
		      }
		    }
		  }
		  private static void loadLessonData() {
			  File file = new File("./lesson.json");
			  try(FileReader in = new FileReader(file)) {
				/*Gson gson = new Gson();
				Lesson[] jsondata = gson.fromJson(in, Lesson[].class);
				for(Lesson lesson : jsondata) {
					lessonList.add(lesson);
				}
				*/
				lessonList.addAll(Arrays.asList(new Gson().fromJson(in, Lesson[].class)));
			
				  
				 
				
				  
			  
			  
			  
		 System.out.printf("총 %d개의 수업 데이터를 로딩했습니다\n",lessonList.size());
		  }catch (IOException e) {
				System.out.println("파일 읽기중 오류 발생" + e.getMessage());
			}
			 
			  }
			
		  
		  private static void saveLessonData() {
			  File file = new File("./lesson.json");
			  try(FileWriter out = new FileWriter(file)) {
				 /* for(Lesson lesson : lessonList) {
					
					  out.write(lesson.toCsvString() + "\n");
					  */  
					  out.write(new Gson().toJson(lessonList));
				
				  System.out.printf("총%d개의 수업 데이터를 저장했습니다\n",lessonList.size());
		  }catch(IOException e) {
			  System.out.println("파일 쓰기 중 오류 발생" +e.getMessage());
		  }

		  
	}
		  private static void loadMemberData() {
			    File file = new File("./member.json");


			    try(FileReader in = new FileReader(file)
			    		
			    		
			    		/*Scanner dataScan = new Scanner(new FileReader(file))*/
			    		
			    		
			    	) {

			      while (true) {
			        try {
			        /*	Gson gson = new Gson();
			        	Member[] jsondata = gson.fromJson(in, Member[].class);
			        	for(Member member:jsondata) {
			        		memberList.add(member);
			        	}*/
			        	
			        	memberList.addAll(Arrays.asList(new Gson().fromJson(in, Member[].class)));
			       //  memberList.add(Member.valueOf(dataScan.nextLine()));

			        } catch (Exception e) {
			          break;
			        }
			      }
			      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", memberList.size());

			    } catch (IOException e) {
			      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
			    }/* finally {
			      try {
			        dataScan.close();
			      } catch (Exception e) {
			      }
			      try {
			        in.close();
			      } catch (Exception e) {
			      }
			    }*/
			  }

			  private static void saveMemberData() {
			    File file = new File("./member.json");


			    try(FileWriter out = new FileWriter(file)) {
			    	
			    	
			    	out.write(new Gson().toJson(memberList));
			    /*  for (Member member : memberList) {
			       out.write(member.toCsvString() + "\n");
			      }
			      */
			      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", memberList.size());

			    } catch (IOException e) {
			      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

			    } 
			  }

			  private static void loadBoardData() {
			    File file = new File("./board.json");


			    try(FileReader in = new FileReader(file)) {

			     
			     
			    
			          boardList.addAll(Arrays.asList(new Gson().fromJson(in, Board[].class)));
			       
			     
			      
			      System.out.printf("총 %d 개의 게시물 데이터를 로딩했습니다.\n", boardList.size());

			    } catch (IOException e) {
			      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
			    }
			  }
			  

			  private static void saveBoardData() {
			    File file = new File("./board.json");


			    try(FileWriter out = new FileWriter(file)) {
			    	
			    	

			 /*     for (Board board : boardList) {
			        out.write(board.toCsvString() + "\n");
			      }*/
			      out.write(new Gson().toJson(boardList));
			      System.out.printf("총 %d 개의 게시물 데이터를 저장했습니다.\n", boardList.size());

			    } catch (IOException e) {
			      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

			    }
			  }
}


