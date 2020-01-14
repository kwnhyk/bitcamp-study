package com.eomcs.lmsst.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push("aaa");
		stack.push("ccc");
		stack.push("bbb");
		stack.push("ddd");
		stack.push("fff");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
