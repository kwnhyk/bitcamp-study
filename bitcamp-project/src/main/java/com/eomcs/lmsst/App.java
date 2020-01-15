package com.eomcs.lmsst;
import java.util.Scanner;

import com.eomcs.lmsst.domain.Lesson;
import com.eomcs.lmsst.domain.Member;
import com.eomcs.lmsst.domain.Board;
import com.eomcs.lmsst.handler.BoardHandler;
import com.eomcs.lmsst.handler.LessonHandler;
import com.eomcs.lmsst.handler.MemberHandler;
import com.eomcs.lmsst.util.Prompt;
import com.eomcs.lmsst.util.Queue;
import com.eomcs.lmsst.util.LinkedList.LinkedList;
import com.eomcs.lmsst.util.Stack.Stack;
import com.eomcs.lmsst.util.ArrayList;
import com.eomcs.lmsst.util.Iterator;

public class App {
	static Scanner keyboard = new Scanner(System.in);
	static  Stack<String> commandStack = new Stack<>();
	static Queue<String> commandQueue = new Queue<>();


	public static void main(String[] args) {
		Prompt prompt = new Prompt(keyboard) ;
		/*유지보수용 공통분모 List 클래스
		 //실제작업 X
		그럼에도 불구하고 개발자가 다음과 같이 List객체를 사용하려 한다면 막을 수 없다
		 BoardHandler의 경우 아무런 작업을 수행하지 않을 것이다
		 왜? List 클래스에 정의된 메서드는 아무것도 하지 않는다.
		 //해결책?
		 이렇게 generalization을 통해 만든 클래스의 경우
		 서브 클래스에게 공통 분모를 물려주기 위한 용도로 사용된다
		 =>이런 류의 클래스는 직접 인스턴스를 생성하지 못하도록 해서 직접 사용하는 것을 
		막아야한다
		이런 용도로 사용하는 문법이 "추상클래스(abstract class)"이다.*/
		LinkedList<Board> boardList = new LinkedList<>();
		BoardHandler boardHandler1 = new BoardHandler(prompt, boardList);
		ArrayList<Lesson> lessonList = new ArrayList<>();
		LessonHandler lessonHandler1 = new LessonHandler(prompt,lessonList);
		LinkedList<Member> memberList = new LinkedList<>();
		MemberHandler memberHandler1 = new MemberHandler(prompt,memberList);

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
				printCommandHistory(commandStack.iterator());
				break;
			case "history2":
				printCommandHistory(commandQueue.iterator());
			default:
				if (!command.equalsIgnoreCase("quit")) {
					System.out.println("실행할 수 없는 명령입니다.");
				}
			}

		} while (!command.equalsIgnoreCase("quit"));

		System.out.println("안녕!");

		keyboard.close();
	}
	

	
	//이전에는  Stack에서 값을 꺼내는 방법과 Queue에서 값을 꺼내는 방법이 다르기 때문에
	//printCommandHistory()와 printCommandHistory2() 메서드를 따로 정의했다.
	//이제 Stack과 Queue는 일관된 방식으로 값을 꺼내주는 Iterator가 있기 때문에
	//두 메서드를 하나로 합칠 수 있다.
	
	private static void printCommandHistory(Iterator<String> iterator) {
		int count =0;
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

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

