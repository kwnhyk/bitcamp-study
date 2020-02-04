// "/board/add" 명령어 처리
package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.List;

import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

	List<Board> boardList;
	ObjectOutputStream out;
	ObjectInputStream in;
	Prompt prompt;

	public BoardAddCommand(ObjectOutputStream out , ObjectInputStream in,Prompt prompt) {
		this.prompt = prompt;
		this.out = out;
		this.in = in;
	}

	@Override
	public void execute() {
		Board board = new Board();

		board.setNo(prompt.inputInt("번호? "));
		board.setTitle(prompt.inputString("내용? "));
		board.setDate(new Date(System.currentTimeMillis()));
		board.setViewCount(0);
		try {
			out.writeUTF("/board/add");
			out.writeObject(board);
			String response = in.readUTF();
			if(response.equals("FAIL")) {
				System.out.println(in.readUTF());
				return;
			}
		}catch(Exception e) {
			System.out.println("통신 오류 발생");


		}

		this.boardList.add(board);

		System.out.println("저장하였습니다.");
	}

}


