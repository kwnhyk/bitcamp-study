package com.eomcs.lmsst.handler;

import com.eomcs.lmsst.util.Prompt;

public class ComputePlusCommand implements Command {

	
	Prompt prompt;
	public ComputePlusCommand(Prompt prompt) {
		 this.prompt = prompt;
		 
	}

	
	@Override
	public void execute() {
		int num = prompt.inputInt("수1?");
		int num2 = prompt.inputInt("수2?");
		int sum = num+num2;
		System.out.printf("계산결과는 %d입니다",sum);
		
	}
}
