package com.eomcs.lmsst;
import java.util.Scanner;

import com.eomcs.lmsst.handler.BoardHandler;
import com.eomcs.lmsst.handler.LessonHandler;
import com.eomcs.lmsst.handler.MemberHandler;
import com.eomcs.lmsst.util.Prompt;
import com.eomcs.lmsst.util.Queue;
import com.eomcs.lmsst.util.Stack.Stack;

public class App {
	  static Scanner keyboard = new Scanner(System.in);
	  static  Stack<String> commandStack = new Stack();
	  static Queue<String> commandQueue = new Queue();
	

	public static void main(String[] args) {
		 Prompt prompt = new Prompt(keyboard) ;
		// LessonHandler의 메서드를 사용하기 전에 
		// 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
	

		// MemberHandler의 메서드를 사용하기 전에 
		// 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
	

		// BoardHandler의 메서드를 사용하기 전에 
		// 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
		BoardHandler boardHandler1 = new BoardHandler(prompt);
		LessonHandler lessonHandler1 = new LessonHandler(prompt);
		MemberHandler memberHandler1 = new MemberHandler(prompt);
		
		String command;

		do {
			System.out.print("\n명령> ");
			command = keyboard.nextLine();
			commandStack.push(command);
			commandQueue.offer(command);
			switch (command) {
			case "/lesson/add":
				// 다른 클래스로 분리한 메서드를 호출할 때는
				// 클래스를 이름을 지정해야 한다.
				lessonHandler1.addLesson();
				break;
			case "/lesson/list":
				lessonHandler1.listLesson();
				break;
			case "/member/add":
				memberHandler1.addMember();
				break;
			case "/lesson/detail":
				lessonHandler1.detailLesson();
				break;
			case "/lesson/update":
				lessonHandler1.updateLesson();
				break;
			case "/lesson/delete":
				lessonHandler1.deleteLesson();
				break;
			case "/member/list":
				memberHandler1.listMember();
			
				break;
			case "/board/add":
				boardHandler1.addBoard();
				break;
			case "/board/list":
				boardHandler1.listBoard();
				break;
			case "/board/detail":
				boardHandler1.detailBoard();
				break;
			case "/board/update":
				boardHandler1.updateBoard();
				break;
			case "/board/delete":
				boardHandler1.deleteBoard();
				break;
			case "history":
				printCommandHistory();
				break;
			case "history2":
				printCommandHistory2();
			default:
				if (!command.equalsIgnoreCase("quit")) {
					System.out.println("실행할 수 없는 명령입니다.");
				}
			}

		} while (!command.equalsIgnoreCase("quit"));

		System.out.println("안녕!");

		keyboard.close();
	}
	private static void printCommandHistory2() {
		Queue<String> historyQueue = commandQueue.clone();
		int count =0;
		while(historyQueue.size()>0) {
			System.out.println(historyQueue.poll());
			if((++count % 5)== 0) {
				System.out.print(":");
				String str = keyboard.nextLine();
				if(str.equalsIgnoreCase("q")) {
					break;
				}
				
			}

			
		}
	}
	private static void printCommandHistory() {
		Stack<String> historyStack = commandStack.clone();
		int count =0;
		while (!historyStack.empty()) {
			System.out.println(historyStack.pop());
			
			count++;
			if((count % 5)== 0) {
				System.out.print(":");
				String str = keyboard.nextLine();
				if(str.equalsIgnoreCase("q")) {
					break;
				}
				
			}
		}
	}
}

